package models.components.global.products;

import models.components.Component;
import models.components.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@ComponentCssSelector(value = ".product-grid")
public class ProductGridCSSComponent extends Component {
    public ProductGridCSSComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public List<ProductItemCSSComponent> productItemComponentList() {
        return findComponents(ProductItemCSSComponent.class, driver);
    }
}
