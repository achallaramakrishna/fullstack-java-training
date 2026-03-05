package com.example.day2app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App2 {

	public static void main(String[] args) {
		
		File file = new File("c:\\test\\hello.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(file.isDirectory()) {
			System.out.println("it is a directory");
		}
	}

}
