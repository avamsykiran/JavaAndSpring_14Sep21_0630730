package com.cts.iod.ui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("FileName? ");
		String fileName = scan.nextLine();
		
		File file = new File(fileName);
		
		System.out.println("Type in the file content ");
		
		try(FileWriter fout = new FileWriter(file)){
			String line = scan.nextLine();
			fout.write(line);
			System.out.println("file saved");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}

}
