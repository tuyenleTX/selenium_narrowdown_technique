package models.components.global.footer;

import models.components.Component;
import models.components.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value = ".footer")
public class FooterComponent extends Component {
    public FooterComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public InformationComponent informationComponent(){
        return findComponent(InformationComponent.class, driver);
    }
    public MyAccountComponent myAccountComponent(){
        return findComponent(MyAccountComponent.class, driver);
    }
    public CustomerServiceComponent customerServiceComponent(){
        return findComponent(CustomerServiceComponent.class, driver);
    }
    public FollowUsComponent followUsComponent(){
        return findComponent(FollowUsComponent.class, driver);
    }
}
