package day14;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ReadExcel {
    @Test
    public void readExcelTest1() throws IOException {

       // belirtilen satir ve sutun degerlerini parametre olarak alip o cell'deki datayi konsola yazdıralım
       // Sonucun konsolda yazanla ayni olduğunu dogrulayin

        int satir = 12;
        int sutun = 2 ;

        String dosyaYolu = "src/resources/ulkeler.xlsx" ;
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        String actualData = workbook.
                getSheet("sayfa1").
                getRow(satir-1).
                getCell(sutun-1)
                .toString();
        //index sifirdan başyadigi icin verilen dataya ulasabilmek icin bir eksigi (-1) ni aliriz
        System.out.println(actualData);

        String expectedData = "Baku";
       Assert.assertEquals(expectedData,actualData);

    }
}
