package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeClassAfterClass {
    //BeforeClass ve AfterClass notasyonlari kullaniliyorsa method static yapilir

    static WebDriver driver;
    @BeforeClass
    public static void beforeClass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
    @Test
    @Ignore
    // calismasini istemediğimiz test icin @Ignor notasyonu kullanilir
    public void method1(){
        driver.get("https://amazon.com");
    }
    @Test
    public void method2(){
        driver.get("https://techproeducation.com");
    }
    @Test
    public void method3(){
        driver.get("https://hepsiburada.com");
    }
}
