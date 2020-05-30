import org.apache.commons.math3.util.Precision;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Termo {

    private static Double x = 350.;
    private static Double y = 350.;
    private static Double z = 50.;
    private static Double formulaForEachPiece = 0.;
    private static Double formulaForSquareMeter = 0.;


    private final static Double B1 = 1.;
    private final static Double B2 = 1.;
    private final static Integer xLimit = 2500;
    private final static Integer yLimit = 2500;

    static List<Double> priceForEach = new ArrayList<>();
    static List<Double> priceForSquareMeter = new ArrayList<>();

    public static void priceForDouble(Glass glass1, Glass glass2, Spacer spacer) throws IOException {
        for (double i = x; i <= xLimit; i+=z) {
            for (double j = y; j <= yLimit; j+=z) {
                formulaForEachPiece = (((glass1.getPrice() + glass2.getPrice()) * i * j) / 1000000) + (spacer.getPrice()  * (2 * i + 2 * j) / 1000);
                priceForEach.add(formulaForEachPiece);
                formulaForSquareMeter = formulaForEachPiece / ((i * j) / 1000000);
                priceForSquareMeter.add(formulaForSquareMeter);
            }
        }
        System.out.println("Media pentru " + glass1.getName() + " + " + spacer.getName()+ " + " + glass2.getName() + " : "  + Termo.averageForSquareMeter()+ " EUR/mp");
        System.out.println(" ---------- ");
        writeToFile(glass1, glass2, Termo.averageForSquareMeter());
        priceForSquareMeter.clear();
        priceForEach.clear();
    }

    public static void priceForTriple(Glass glass1, Glass glass2, Glass glass3, Spacer spacer1, Spacer spacer2) throws IOException {
        for (double i = x; i <= xLimit; i+=z) {
            for (double j = y; j <= yLimit; j+=z) {
                formulaForEachPiece = ((((glass1.getPrice() + glass2.getPrice() + glass3.getPrice()) * i * j) / 1000000) + ((B1 + B2) * (2 * i + 2 * j) / 1000)) * 1.;
                priceForEach.add(formulaForEachPiece);
                formulaForSquareMeter = formulaForEachPiece / ((i * j) / 1000000);
                priceForSquareMeter.add(formulaForSquareMeter);
            }
        }
        System.out.println("Media pentru " + glass1.getName() + " + " + spacer1.getName() + " + " + glass2.getName() + " + " + spacer2.getName() + " + "  + glass3.getName() + " : "  + Termo.averageForSquareMeter()+ " EUR/mp");
        System.out.println(" ---------- ");
        writeToFile(glass1, glass2, glass3, Termo.averageForSquareMeter());
        priceForSquareMeter.clear();
        priceForEach.clear();
    }

    public static void writeToFile(Glass glass1, Glass glass2, double averagePrice) throws IOException {
        int rowIndex = 0;
        int columnIndex = 0;
        File excelFile = new File("C://Users//szili//Desktop//preturi.xlsx");
        FileInputStream inputStream = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        List<XSSFCell> valuesFromFirstColumn = new ArrayList<XSSFCell>();
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            XSSFRow row = sheet.getRow(i);
            valuesFromFirstColumn.add(row.getCell(0));
        }

        List<XSSFCell> valuesFromFirstLine = new ArrayList<XSSFCell>();
        XSSFRow firstRow = sheet.getRow(0);
        for (int i = 0; i < firstRow.getLastCellNum(); i++) {
            XSSFCell cell = firstRow.getCell(i);
            valuesFromFirstLine.add(cell);
        }

        for (XSSFCell firstGlass : valuesFromFirstColumn) {
            if(firstGlass.getStringCellValue().equalsIgnoreCase(glass1.getName())){
                rowIndex = firstGlass.getRowIndex();
                break;
            }
        }

        for (XSSFCell secondGlass : valuesFromFirstLine) {
            if (secondGlass.getStringCellValue().equalsIgnoreCase(glass2.getName())){
                columnIndex = secondGlass.getColumnIndex()+1;
                break;
            }
        }

        XSSFRow row = sheet.getRow(rowIndex);
        XSSFCell cell = row.getCell(columnIndex);
        cell.setCellValue(averagePrice);

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(excelFile);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }

    public static void writeToFile(Glass glass1, Glass glass2, Glass glass3, double averagePrice) throws IOException {
        int rowIndex = 0;
        int columnIndex = 0;
        File excelFile = new File("C://Users//szili//Desktop//preturi.xlsx");
        FileInputStream inputStream = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        List<XSSFCell> valuesFromFirstColumn = new ArrayList<XSSFCell>();
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            XSSFRow row = sheet.getRow(i);
            valuesFromFirstColumn.add(row.getCell(0));
        }

        List<XSSFCell> valuesFromFirstLine = new ArrayList<XSSFCell>();
        XSSFRow firstRow = sheet.getRow(0);
        for (int i = 0; i < firstRow.getLastCellNum(); i++) {
            XSSFCell cell = firstRow.getCell(i);
            valuesFromFirstLine.add(cell);
        }

        for (XSSFCell firstGlass : valuesFromFirstColumn) {
            if(firstGlass.getStringCellValue().equalsIgnoreCase(glass1.getName()+" + "+ glass2.getName())){
                rowIndex = firstGlass.getRowIndex();
                break;
            }
        }

        for (XSSFCell secondGlass : valuesFromFirstLine) {
            if (secondGlass.getStringCellValue().equalsIgnoreCase(glass3.getName())){
                columnIndex = secondGlass.getColumnIndex()+1;
                break;
            }
        }

        XSSFRow row = sheet.getRow(rowIndex);
        XSSFCell cell = row.getCell(columnIndex);
        cell.setCellValue(averagePrice);

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(excelFile);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }

    public static double averageForSquareMeter() {
        double sum = 0;
        for (int i = 0; i < priceForSquareMeter.size(); i ++){
            sum = sum + priceForSquareMeter.get(i);
        }
        double average = Precision.round(sum/priceForSquareMeter.size(),2);
        return average;
    }

//    public static double averageForX() {
//        double sum = 0;
//        for (int i = 0; i < xValues.size(); i ++){
//            sum = sum + xValues.get(i);
//        }
//        double average = sum/xValues.size();
//        return average;
//    }


//    public static double averageForPriceForEach() {
//        double sum = 0;
//        for (int i = 0; i < priceForEach.size(); i++) {
//            sum = sum + priceForEach.get(i);
//        }
//        double average = sum / priceForEach.size();
//        return average;
//    }

}





