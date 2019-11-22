package selenium2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class newtest45 {
  @Test
  public void testExcell() throws IOException
  {
	  FileInputStream fis=new FileInputStream("C:\\Users\\Training_b6b.01.03\\Desktop\\excell.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  int rowCount = sheet1.getPhysicalNumberOfRows();
	  XSSFRow row1 = sheet1.getRow(0);
	  int cellCount = row1.getPhysicalNumberOfCells();
	  for(int i=0;i<rowCount;i++) {
		  for(int j=0;j<cellCount;j++) {
			  System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue());
  }
}
sheet1.getRow(0).createCell(2).setCellValue("Valid");
sheet1.getRow(1).createCell(2).setCellValue("Valid");
sheet1.getRow(2).createCell(2).setCellValue("InValid");
FileOutputStream fos = new  FileOutputStream("C:\\\\Users\\\\Training_b6b.01.03\\\\Desktop\\\\excell.xlsx");
wb.write(fos);
}
}