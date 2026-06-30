package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelReader {

    public static String getData(int row,int cell) {

        String value="";

        try {

            FileInputStream fis =
                    new FileInputStream("TestData.xlsx");

            Workbook wb =
                    WorkbookFactory.create(fis);

            Sheet sheet =
                    wb.getSheet("Travel");

            value =
                    sheet.getRow(row)
                            .getCell(cell)
                            .toString();

            wb.close();

        } catch(Exception e) {

            e.printStackTrace();
        }

        return value;
    }
}