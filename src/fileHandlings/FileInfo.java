package fileHandlings;
import java.io.*;
public class FileInfo {

	public static void main(String[] args) {

		File f=new File("D:\\java\\eclipse\\CreateAJavaFile.txt");
		if(f.exists())
		{
			System.out.println("File Name: "+f.getName());
			System.out.println("File Path: "+f.getAbsolutePath());
			System.out.println("File Writeable: "+f.canWrite());
			System.out.println("File Writeable: "+f.canRead());
			System.out.println("File Size: "+f.length());
			System.out.println("File removed: "+f.delete());
		}
		else
		{
			System.out.println("File is Not Present");
		}
	}

}
