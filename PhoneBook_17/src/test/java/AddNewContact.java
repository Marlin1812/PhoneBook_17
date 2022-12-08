import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewContact extends TestBase {

    @BeforeMethod
    public void preCondition() {
        if (app.getUser().isLogged()) {
            app.getUser().pause(30);

        } else {
            app.getUser().openLoginRegistrationForm();
            app.getUser().fillLoginRegistrationForm("abc123@hot.com","$Abcdef12345");
            app.getUser().submitLogin();
            app.getUser().pause(30);

        }
    }

    @Test
    public void addNewContactPositive() {
        app.getUser().click(By.xpath("//a[@href='/add']"));
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        String name = "John" + i;
        String lastname = "Snow" + i;
        String phone = "055666777" + i;
        String email = "john" + i + "@mail.com";
        String address = "Haifa" + i;
        String description = "friend" + i;

        app.getUser().type(By.xpath("//input[1]"),name);
        app.getUser().type(By.xpath("//input[2]"),lastname);
        app.getUser().type(By.xpath("//input[3]"),phone);
        app.getUser().type(By.xpath("//input[4]"),email);
        app.getUser().type(By.xpath("//input[5]"),address);
        app.getUser().type(By.xpath("//input[5]"),description);
//        app.getUser().type();

        app.getUser().click(By.xpath("//button[.='Save']"));
        app.getUser().pause(30);



        Assert.assertTrue(app.getUser().getText(By.xpath("//div[@class='contact-item_card__2SOIM'][last()]//h3")).equals(phone));
    }

}
