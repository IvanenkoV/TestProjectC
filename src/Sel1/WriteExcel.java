package Sel1;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {



    public static void main(String[] args) throws IOException {

        FileOutputStream file=new FileOutputStream("D://УЧЕБА/CucumberTesrtNG/19/ClassExamples/ClassExamples/testdata123.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook();

        XSSFSheet sheet=workbook.createSheet("data");

        for(int i=0;i<=5;i++)
        {
            XSSFRow row=sheet.createRow(i);

            for(int j=0;j<3;j++)
            {
                row.createCell(j).setCellValue("welcome");
            }
        }

        workbook.write(file);

        System.out.println("Writing excel is completed");

    }
}
