package com.corrine.oop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ji416\\OneDrive\\문서\\temp\\test.txt");
		
		Scanner sc = new Scanner(file);
		
		String fileContent = "THIS IS A NEW FILE MADE BY JAVA" + "\n"; 
		while(sc.hasNextLine()) {
			fileContent = fileContent.concat(sc.nextLine() + "\n");
		}

		FileWriter writer = new FileWriter("C:\\Users\\ji416\\OneDrive\\문서\\temp\\newfile.txt"); 
		writer.write(fileContent);
		writer.close();
		
	}
}
