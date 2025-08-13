package tests.global;

import driver.DriverFactory;
import models.components.global.products.ProductItemCSSComponent;
import models.components.global.products.ProductItemXpathComponent;
import models.pages.HomePage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            testFeaturedProductHomePage(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
    private static void testFeaturedProductHomePage(WebDriver driver) {
        driver.get("https://demowebshop.tricentis.com/");
        HomePage homePage = new HomePage(driver);
        //List<ProductItemCSSComponent> productItemComponentList = homePage.productGridComponent().productItemComponentList();
        List<ProductItemXpathComponent> productItemComponentList = homePage.productGridXpathComponent().productItemComponentList();
        for (int i = 0; i < productItemComponentList.size(); i++) {
            System.out.println(productItemComponentList.get(i).getProductTitle().getText());
        }
    }
}
