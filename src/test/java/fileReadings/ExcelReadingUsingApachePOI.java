package fileReadings;

/*
We use apache poi to read excel files
So, we need to add dependencies in pom.xml
We need to add few apache poi dependencies - make sure that, all those dependencie's versions are same

Where is the file 

File file = new File(excelFilePath);
FileInputStream fis = new FileInputStream(file);

what is my excel file's extn
xls - HSSFWorkbook
xlsx - XSSFWorkbook
XSSFWorkbook wb = new XSSFWorkbook(fis);

Which sheet to read
wb.getSheet(sheetNumber/sheetName); //Sheet number, Sheet name

Access row and iterate the row
Row row = new Row();
row.getLastRowNumber();
for(int i=0; i<row.getLastRowNumber();i++) {

}

You need to know the cell type: CellType - getCellType()
String cell or Numeric cell

To read cell
getStringCellValue();
getNumericCellValue();
 */

public class ExcelReadingUsingApachePOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
