package resources.testdata;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import java.io.File;
import java.io.FileInputStream;

public class readExcel {
    public static void readData() throws Exception
    {
        HSSFSheet sheet;
        HSSFCell cell;
// Import excel sheet.
        File src = new File("C:\\Users\\kaush\\Desktop\\exl123.xlsx");
// Load the file.
        FileInputStream finput = new FileInputStream(src);
// Load the workbook.
        HSSFWorkbook workbook = new HSSFWorkbook(finput);
// Load the sheet in which data is stored.
        sheet= workbook.getSheetAt(0);
        for(int i=1; i<=sheet.getLastRowNum(); i++)
        {
// Import data for Email.
            cell = sheet.getRow(i).getCell(1);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            System.out.println(cell.getStringCellValue());
// Import data for password.
            cell = sheet.getRow(i).getCell(2);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            System.out.println(cell.getStringCellValue());
        }
    }


}
