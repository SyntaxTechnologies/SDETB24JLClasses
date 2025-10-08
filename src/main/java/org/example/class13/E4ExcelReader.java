package org.example.class13;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {

        // location of the file
        String path="Files/Employees.xlsx";
        // reading the data in the form of 10101010
        FileInputStream fis=new FileInputStream(path);
        // A special class to read the data from Excel files
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet1=excel.getSheet("Sheet1");
        Row row=sheet1.getRow(3);
        Cell cell0=row.getCell(0);
        Cell cell1=row.getCell(1);
        Cell cell2=row.getCell(2);
        Cell cell3=row.getCell(3);
        Cell cell4=row.getCell(4);
        System.out.println(cell0+" "+cell1+" "+cell2+" "+cell3+" "+cell4);

    }
}
