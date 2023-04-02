import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Deneme {

    public static void main(String[] args) throws InterruptedException {

        // https://www.amazon.com/ adresine gidin
        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        // sayfayi kapatiniz
        WebDriverManager.chromedriver().setup();  // chrome ayarlarımızı yapalım
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // sayfanın yuklenmesi icin max bekleme suresi
        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

       WebElement button= driver.findElement(By.xpath("//input[@id=  'twotabsearchtextbox']"));
       String tagname=button.getTagName();
        System.out.println(tagname);

        System.out.println(button.getAttribute("id"));
Thread.sleep(3000);
    }}