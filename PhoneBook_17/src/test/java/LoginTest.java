import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    WebDriver wd;

//    @BeforeMethod
//    public void init(){
//        wd = new ChromeDriver();
//        wd.navigate().to("https://telranedu.web.app/home");
//
//    }
//    public void preCondition(){
//        if(isLogged()){
//            logout();
//        }
//    }

    @Test
    public void loginPositiveTest(){
//        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
//        String email = "abc123@hot.com";
//        String password = "$Abcdef12345";
//         open login/reg form
//        WebElement loginBtn = wd.findElement(By.xpath("//a[text()='LOGIN']"));
//        loginBtn.click();
//        openLoginRegistrationForm();
//        fillLoginRegistrationForm(email, password);
//        submitRegistration();
//        pause(3);
//        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//a[@href='/ADD']")));
//         fill login/reg form
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("abc123@hot.com\n");
//
////         fill password form
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("$Abcdef12345\n");
//
////         click on Login button
//        wd.findElement(By.xpath("//button[1]")).click();
//
////         Assert
//        pause(3);
//        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//a[@href='/add']")));
//        Assert.assertTrue(wd.findElement(By.xpath("//a[@href='/add']"))!=null);

//        User data = new User().withEmail("abc123@hot.com").withPassword("$Abcdef12345");
//        app.getUser().openLoginRegForm();
//        app.getUser().fillLoginRegForm("abc123@hot.com");
//        app.getUser().submitLogin();
//
//        app.getUser().pause(30);
//        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//a[@href='/add']")));
//    }

//    @AfterMethod
//    public void tearDown(){
//        wd.quit();
    }

}