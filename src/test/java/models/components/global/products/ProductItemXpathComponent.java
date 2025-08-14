package models.components.global.products;

import models.components.Component;
import models.components.ComponentCssSelector;
import models.components.ComponentXpathSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentXpathSelector(value="//*[@class='product-item']")
public class ProductItemXpathComponent extends Component {
    private static final By productTitleSel = By.xpath(".//*[@class='product-title']");
    public ProductItemXpathComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public WebElement getProductTitle() {
        return component.findElement(productTitleSel);
    }
}
