package models.components.global.products;

import models.components.Component;
import models.components.ComponentCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value=".product-item")
public class ProductItemCSSComponent extends Component {
    private static final By productTitleSel = By.cssSelector(".product-title");
    public ProductItemCSSComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public WebElement getProductTitle() {
        return component.findElement(productTitleSel);
    }
}
