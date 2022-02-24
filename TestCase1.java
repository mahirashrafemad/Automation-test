package Selenium_test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public void setUp() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver" , "C:\\Users\\ASUS\\eclipse-workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");

      driver = new FirefoxDriver();
    
    
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("http://automationpractice.com/index.php");
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.id("email_create")).clear();
    driver.findElement(By.id("email_create")).sendKeys("1234gg3@gmail.com");
    driver.findElement(By.xpath("//button[@id='SubmitCreate']/span")).click();
    driver.findElement(By.id("id_gender1")).click();
    driver.findElement(By.id("customer_firstname")).click();
    driver.findElement(By.id("customer_firstname")).clear();
    driver.findElement(By.id("customer_firstname")).sendKeys("John");
    driver.findElement(By.id("customer_lastname")).click();
    driver.findElement(By.id("customer_lastname")).clear();
    driver.findElement(By.id("customer_lastname")).sendKeys("Parker");
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("12345678");
    driver.findElement(By.id("address1")).click();
    driver.findElement(By.id("address1")).clear();
    driver.findElement(By.id("address1")).sendKeys("Dhaka");
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("city")).clear();
    driver.findElement(By.id("city")).sendKeys("Dhaka");
    driver.findElement(By.id("id_state")).click();
    new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Alabama");
    driver.findElement(By.xpath("//select[@id='id_state']/option[2]")).click();
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).clear();
    driver.findElement(By.id("postcode")).sendKeys("12345");
    driver.findElement(By.id("phone_mobile")).click();
    driver.findElement(By.id("phone_mobile")).clear();
    driver.findElement(By.id("phone_mobile")).sendKeys("01711111111");
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.id("alias")).clear();
    driver.findElement(By.id("alias")).sendKeys("My address1");
    driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
    driver.findElement(By.linkText("Sign out")).click();
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.id("email_create")).clear();
    driver.findElement(By.id("email_create")).sendKeys("1234gg4@gmail.com");
    driver.findElement(By.xpath("//button[@id='SubmitCreate']/span")).click();
    driver.findElement(By.xpath("//form[@id='account-creation_form']/div/div/div/label")).click();
    driver.findElement(By.id("customer_firstname")).click();
    driver.findElement(By.id("customer_firstname")).clear();
    driver.findElement(By.id("customer_firstname")).sendKeys("John");
    driver.findElement(By.id("customer_lastname")).click();
    driver.findElement(By.id("customer_lastname")).clear();
    driver.findElement(By.id("customer_lastname")).sendKeys("Parker");
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("12345678");
    driver.findElement(By.id("address1")).click();
    driver.findElement(By.id("address1")).clear();
    driver.findElement(By.id("address1")).sendKeys("Dhaka");
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("city")).clear();
    driver.findElement(By.id("city")).sendKeys("Dhaka");
    driver.findElement(By.id("id_state")).click();
    new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Connecticut");
    driver.findElement(By.xpath("//select[@id='id_state']/option[8]")).click();
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).clear();
    driver.findElement(By.id("postcode")).sendKeys("12345");
    driver.findElement(By.id("phone_mobile")).click();
    driver.findElement(By.id("phone_mobile")).clear();
    driver.findElement(By.id("phone_mobile")).sendKeys("01711111111");
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.id("alias")).clear();
    driver.findElement(By.id("alias")).sendKeys("My address2");
    driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
    driver.findElement(By.linkText("Sign out")).click();
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("1234gg3@gmail.com");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("12345678");
    driver.findElement(By.xpath("//button[@id='SubmitLogin']/span/i")).click();
    driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul/li/a")).click();
    driver.findElement(By.xpath("//div[@id='center_column']/ul/li/div/div[2]/div[2]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span")).click();
    driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();
    driver.findElement(By.id("layered_id_attribute_group_14")).click();
    driver.findElement(By.id("color_2")).click();
    driver.findElement(By.xpath("//p[@id='add_to_cart']/button/span")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.xpath("//form[@id='form']/p/button/span")).click();
    driver.findElement(By.xpath("//div[@id='HOOK_PAYMENT']/div[2]/div/p/a/span")).click();
    driver.findElement(By.xpath("//p[@id='cart_navigation']/button/span")).click();
    driver.findElement(By.linkText("Sign out")).click();
  }

  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      //fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
