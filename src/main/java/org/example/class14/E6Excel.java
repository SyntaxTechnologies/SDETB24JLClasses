package org.example.class14;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E6Excel {
    public static void main(String[] args) throws IOException {


        String path="Files/Employees.xlsx";
        // reading the data in the form of 10101010
        FileInputStream fis=new FileInputStream(path);
        // A special class to read the data from Excel files
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet1=excel.getSheet("Sheet1");


        List<Map<String,String>> excelData=new ArrayList<>();

        // we are extracting the first row here because we will use it as header to create maps for all rows
        Row headerRow=sheet1.getRow(0);
        for (int rowNo = 1; rowNo < sheet1.getPhysicalNumberOfRows(); rowNo++) {
            Row row=sheet1.getRow(rowNo);
            Map<String,String> rowMap=new LinkedHashMap<>();
            for (int cellNo = 0; cellNo < row.getPhysicalNumberOfCells(); cellNo++) {

                String key= headerRow.getCell(cellNo).toString();
                String value=row.getCell(cellNo).toString();
                rowMap.put(key,value);
            }

            excelData.add(rowMap);

        }
        System.out.println(excelData);


    }
}
