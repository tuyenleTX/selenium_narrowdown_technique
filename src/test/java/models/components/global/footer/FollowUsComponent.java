package models.components.global.footer;

import models.components.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value = ".column.follow-us")
public class FollowUsComponent extends FooterColumnComponent{
    public FollowUsComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
