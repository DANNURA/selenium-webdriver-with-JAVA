package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result text incorrect");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();

        String text = "TAU rocks!";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You entered: " + text, "Results text incorrect");
    }
}
