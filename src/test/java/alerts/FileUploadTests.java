package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\charl\\IdeaProjects\\practices2\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadFile(), "chromedriver.exe", "Uploaded unsuccessful");
    }
}
