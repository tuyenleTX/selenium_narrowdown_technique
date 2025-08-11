package tests.global;

import driver.DriverFactory;
import models.components.global.footer.*;
import models.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import urls.Urls;

public class FooterTest {

    @Test
    public void testFooterHomePage() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(Urls.demoBaseUrl);
        HomePage homePage = new HomePage(driver);
        InformationComponent informationColumnComponent = homePage.footerComponent().informationComponent();
        testFooterColumn(informationColumnComponent);

        CustomerServiceComponent customerServiceColumnComponent = homePage.footerComponent().customerServiceComponent();
        testFooterColumn(customerServiceColumnComponent);

        MyAccountComponent myAccountColumnComponent = homePage.footerComponent().myAccountComponent();
        testFooterColumn(myAccountColumnComponent);

        FollowUsComponent followUsColumnComponent = homePage.footerComponent().followUsComponent();
        testFooterColumn(followUsColumnComponent);
        driver.quit();
    }
    private void testFooterColumn(FooterColumnComponent footerColumnComponent) {
        System.out.println(footerColumnComponent.headerElem().getText());
        footerColumnComponent.linksElem().forEach(link -> {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        });
    }
}
