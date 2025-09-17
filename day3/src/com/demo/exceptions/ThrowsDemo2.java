package com.demo.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = null;

		fis = new FileInputStream("demo.txt");
		int b = 0;
		while ((b = fis.read()) != -1) {
			System.out.print((char) b);
		}

		fis.close();

	}

}
