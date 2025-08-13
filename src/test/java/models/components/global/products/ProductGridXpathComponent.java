package models.components.global.products;

import models.components.Component;
import models.components.ComponentCssSelector;
import models.components.ComponentXpathSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@ComponentXpathSelector(value = "//*[contains(@class,'product-grid')]")
public class ProductGridXpathComponent extends Component {
    public ProductGridXpathComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public List<ProductItemXpathComponent> productItemComponentList() {
        return findComponents(ProductItemXpathComponent.class, driver);
    }
}
