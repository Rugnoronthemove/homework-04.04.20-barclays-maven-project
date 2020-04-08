package uk.co.barclays.testsuite;

import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

public class TestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();

    //TestCases
    @Test
    public void verifyMouseHoverActionOnBankDropDownLink() {
        //mouseHover on bank dropdown link
        homePage.mouseHoverOnBankDropDownLink();
    }

    @Test
    public void verifyMouseHoverOnBorrowDropDownLink() {
        //mouseHover on borrow dropdown link
        homePage.mouseHoverOnBorrowDropDownLink();
    }

}
