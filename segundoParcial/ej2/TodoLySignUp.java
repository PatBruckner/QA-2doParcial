package segundoParcial.ej2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TodoLySignUp {


        ChromeDriver driver;

        @Before
        public void before(){

            System.setProperty("webdriver.chrome.driver","src/test/resources/chromeDriver/chromedriver.exe");
            driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        @Test
        public void loginTodoLy(){
            driver.get("http://todo.ly/");

            //------ SignUp ------
            //1) Click SignUp Button
            driver.findElement(By.xpath("//img[@src='/Images/design/SignupBtn.png']")).click();
            //2) Set Full Name
            driver.findElement(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxFullName']")).sendKeys("Patrick Bruckner");
            //2) Set Email
            driver.findElement(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxEmail']")).sendKeys("upbP123@upbui.com");
            //3) Set Password
            driver.findElement(By.xpath("//input[@name='ctl00$MainContent$SignUpControl1$TextBoxPassword']")).sendKeys("12345");
            //4) Checkbox
            driver.findElement(By.xpath("//input[@id='ctl00_MainContent_SignupControl1_CheckBoxTerms']")).sendKeys("true");
            //4) Click Login Button
            driver.findElement(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$ButtonSignup']")).click();

            // *) Verificar si estoy logueado

            Assert.assertTrue("Error, no se pudo hacer signup",driver.findElement(By.xpath("//a[contains(.,'Logout')]")).isDisplayed());

        }

        @After
        public void after() throws InterruptedException {
            Thread.sleep(5000);
            driver.quit();
        }
    }


