package com.lumen.demo;

import java.io.File;

import java.io.FileInputStream;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {

		try {

			File file = new File(
					"C:/Users/AD36043/seleExcel/New Microsoft Excel Worksheet.xlsx"); // creating
																														// a
																														// new
																														// file
																														// instance

			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file

			// creating Workbook instance that refers to .xlsx file

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// First Sheet starts from zero(0)

			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object

			Iterator<Row> itr = sheet.iterator(); // iterating over excel file

			while (itr.hasNext()) {

				Row row = itr.next();

				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column

				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {

					case STRING: // field that represents string cell type

						System.out.print(cell.getStringCellValue() + "\t\t\t");

						break;

					case NUMERIC: // field that represents number cell type

						System.out.print(cell.getNumericCellValue() + "\t\t\t");

						break;

					default:

					}

				}

				System.out.println("");

			}

			wb.close();

		} catch (Exception e) {

			e.printStackTrace();

		}		finally {

		}

	}

}
