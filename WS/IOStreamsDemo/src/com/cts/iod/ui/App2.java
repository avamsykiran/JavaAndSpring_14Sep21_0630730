package com.cts.iod.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("FileName? ");
		String fileName = scan.nextLine();
		
		File file = new File(fileName);
		
		if(file.exists()) {
			/*try(FileReader fin = new FileReader(file)){
				char[] data = new char[1024];
				while(fin.read(data)>-1) {
					System.out.println(new String(data));
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}*/
			try(BufferedReader fin = new BufferedReader(new FileReader(file))){
				String line=null;
				while(true) {
					line = fin.readLine();
					if(line==null) break;
					System.out.println(line);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("No such file exists");
		}
		
		
		
		scan.close();
	}

}
