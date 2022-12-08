package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void submitLogin(){
        click(By.xpath("//button[1]"));
    }
    public void submitRegistration(){
        click(By.xpath("//button[2]"));
    }

    public boolean isLogged(){
        return isElementPresent(By.xpath("//button[text='Sign Out']"));
    }

    public void logout() {
        WebElement logoutButton = wd.findElement(By.xpath("//button"));
        if (logoutButton.getText().equals("Sign Out")) {
            click(By.xpath("//button"));
        }
    }

    public void openLoginRegistrationForm(){
        click(By.xpath("//a[text()='LOGIN']"));
    }

    public void fillLoginRegistrationForm(String email, String password){
        type(By.xpath("//input[1]"), email);
        type(By.xpath("//input[2]"), password);
    }


}
