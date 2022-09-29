package day15;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_GetScreenShot extends TestBaseBeforeAfter {
    @Test
    public void test1() throws IOException {
        //Amazon sayfasina gidelim tum sayfanin resmini alalim
        driver.get("https://bestbuy.com");

        /*
        Bir we sayfasinin resmini alabilmek icin TakesScreenshot class'in dan obje olusturup
        gecici bir File class'indan degiskene  TakesScreenshot'dan olusturdugum objeden getScreenShotAs
        methodunu kullanarak gecici bir File olustururuz
         */
        TakesScreenshot ts = (TakesScreenshot)  driver;
        File tumSayfaResmi = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSayfaResmi,new File("target/ekranGoruntusu/allPage"+tarih+".jpeg"));

    }
}
