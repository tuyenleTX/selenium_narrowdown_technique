package models.components.global.footer;

import models.components.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value = ".column.my-account")
public class MyAccountComponent extends FooterColumnComponent{
    public MyAccountComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
