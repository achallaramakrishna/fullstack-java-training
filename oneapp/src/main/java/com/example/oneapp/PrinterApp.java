package com.example.oneapp;
import java.util.*;

public class PrinterApp {

	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		Printer printer = null;
		while(true) {
			
			System.out.println("1. Dot Matrix Printer ");
			System.out.println("2. Inkjet Printer ");
			System.out.println("Exit ");
			System.out.println("Enter the choice :");
			choice = scanner.nextInt();
			switch(choice) {
				case 1:
					printer = new DotMatrixPrinter();
					break;
				case 2:
					printer = new InkjetPrinter();
					break;
				case 3:
					System.exit(0);
					
			}
			printer.print();
			
		}

	}

}






