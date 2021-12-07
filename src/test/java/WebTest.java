import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTest {


        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://sputnik-tele.com/");
            driver.findElement(By.className("connection-form__input")).sendKeys("Константин");
           driver.findElement(By.xpath("//input[@placeholder='+380 71']")).sendKeys("5553535");
           driver.findElement(By.className("connection-form__input--tech")).sendKeys("Спасибо за качественные услуги");
         /*  driver.findElement(By.className("connection-form__button")).click();*/




        }

    }


