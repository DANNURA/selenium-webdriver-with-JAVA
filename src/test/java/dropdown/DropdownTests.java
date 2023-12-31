package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
       var dropDownPage = homePage.clickDropDown();
       String option = "Option 1";
       dropDownPage.selectDropdown(option);
       var selectedOptions = dropDownPage.getSelectOptions();
       assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
       assertTrue(selectedOptions.contains(option), "Options not selected");
    }
}
