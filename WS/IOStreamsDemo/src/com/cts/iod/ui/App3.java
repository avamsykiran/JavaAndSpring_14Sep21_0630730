package com.cts.iod.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Source FileName? ");
		String srcFileName = scan.nextLine();
		
		System.out.print("Target FileName? ");
		String tgtFileName = scan.nextLine();
		
		File srcfile = new File(srcFileName);
		File tgtfile = new File(tgtFileName);
		
		if(srcfile.exists()) {
			try(
					FileInputStream fin = new FileInputStream(srcfile);
					FileOutputStream fout = new FileOutputStream(tgtfile);
				){
				
				byte[] data = new byte[1024];
				
				while(fin.read(data)>-1)
					fout.write(data);
				
				System.out.println("Files got copied");
			}catch(IOException exp) {
				System.out.println(exp.getMessage());
			}
		}else {
			System.out.println("No such source file exists");
		}
		
		
		
		scan.close();
	}

}
