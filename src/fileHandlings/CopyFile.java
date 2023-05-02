package fileHandlings;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("D:\\java\\eclipse\\CreateFile.txt");
		FileOutputStream change=new FileOutputStream("D:\\java\\eclipse\\ChangeFile.txt");

		int i;
		while((i=fis.read())!=-1) {
			change.write((char)i);
		}
		System.out.println("File Copied Successfully");
	}

}
