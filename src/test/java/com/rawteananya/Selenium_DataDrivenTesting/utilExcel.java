package com.rawteananya.Selenium_DataDrivenTesting;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class utilExcel {

    public static String path = System.getProperty("user.dir") + "/src/test/resources/TestData1.xlsx";
    static Workbook workbook;
    static Sheet sheet;


    public static Object[][] getTestDatafromExcel (String sheetname){

        // Apache POI
        // Read the file - TestData.xlsx
        // Workbook creation
        // Sheet
        // Row and Cell
        // 2D Object = getData()

        FileInputStream fileInputStream = null;

        try{
            fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet(sheetname);

        }catch (IOException e){
            System.out.println("File not found!!");
        }

        Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum();i++){
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++ ){

                // first row Column name [Email,Password] --> Skip header
                data [i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }

        return data;

    }
}
