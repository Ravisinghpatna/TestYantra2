package fileHandlings;

import java.io.File;

public class RenameFile {
	public static void main(String[] args) {
		
		File f=new File("D:\\java\\eclipse\\CreateFile.txt");
		File n=new File("D:\\java\\eclipse\\JavaFile.txt");
		
		if(f.exists())
		{
			System.out.println(f.renameTo(n));
		}
		else
		{
			System.out.println("File Doesn't exists");
		}
		
	}
}
