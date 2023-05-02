package fileHandlings;

import java.io.File;
import java.io.IOException;

public class CreateFile{

	public static void main(String[] args){
		File fi=new File("D:\\java\\eclipse\\CreateAJavaFile.txt");
		try{
			if(fi.createNewFile())

			{
				System.out.println("Java File is Created");
			}
			else
			{
				System.out.println("file already Exist");
			}
		}
		catch(Throwable t)
		{
			System.out.println("Exception Handle");
		}


	}

}
