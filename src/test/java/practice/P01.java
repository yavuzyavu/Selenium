package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 extends TestBaseBeforeAfter {
    @Test
    public void test() {
        // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

// ikinci emojiye tıklayın (hayvan emojisini seçin)
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"emoojis\"]"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("(//*[@class=\"mdl-tabs__ripple-container mdl-js-ripple-effect\"])[2]")).click();
// tüm hayvan emojilerine tıklayın

// formu doldurun (dilediğinizi yazabilirsiniz)
        List<WebElement> textBox = driver.findElements(By.xpath("//input[@class=\"mdl-textfield__input\"]"));



        //bu listi kullanarak her bir WebElementi kolayca textBox listinde bulunan webelementlerimize gonderebilecegiz
        List<String> text = new ArrayList<>(Arrays.asList("haci","nasil","bu","usul","is","tam","anla","tamam","olur","mu","ok"));

        for (int i = 0; i <textBox.size() ; i++) {
            textBox.get(i).sendKeys(text.get(i));

        }

// apply butonuna tıklayın
        driver.findElement(By.xpath("//button[@id=\"send\"]")).click();
    }

}
