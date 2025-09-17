package com.demo.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWIthResourceDemo {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("demo.txt");) {

			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not found");
		} catch (IOException e) {
			System.out.println("Read Error..");
		}

	}

}
