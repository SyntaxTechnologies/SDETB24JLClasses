package org.example.class14;

import org.example.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E7Excel {
    public static void main(String[] args) throws IOException {

     List<Map<String,String>> excelData=   ExcelReader.read("Files/Employees.xlsx");

        for (int i = 0; i < excelData.size(); i++) {
            System.out.println(excelData.get(i).get("First Name")+" "+excelData.get(i).get("Age"));
        }
        
    }
}
