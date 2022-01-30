package com.streams;

import java.io.File;
import java.io.FileFilter;

public class DemoIO {
	
	public static void main(String[] args) {
		File dir=new File("/home/raj/Desktop/tools/sts-bundle/sts-3.9.12.RELEASE");
		if(dir.isDirectory()) {
			File[] files=dir.listFiles( File::isHidden);
			
			for(File file: files) {
				System.out.println(file.getName());
			}
		}
	}

}