package models.pages;

import models.components.Component;
import models.components.global.footer.FooterComponent;
import models.components.global.products.ProductGridCSSComponent;
import models.components.global.products.ProductGridXpathComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends Component {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        super(driver, driver.findElement(By.tagName("html")));
        this.driver = driver;
    }

    public ProductGridCSSComponent productGridComponent() {
        return findComponent(ProductGridCSSComponent.class, driver);
    }

    public ProductGridXpathComponent productGridXpathComponent() {
        return findComponent(ProductGridXpathComponent.class, driver);
    }
    public FooterComponent footerComponent(){
        return findComponent(FooterComponent.class,driver);
    }
}
