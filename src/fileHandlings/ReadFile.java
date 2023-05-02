package fileHandlings;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		try {
			FileReader f=new FileReader("D:\\java\\eclipse\\CreateAJavaFile.txt");
			try {
				int i;
				while((i=f.read())!=-1){
					System.out.print((char)i);
				}

			}
			finally {
				f.close();
				System.out.print("\r\n File closed...");
			}
		}
		catch(IOException o)
		{
			System.out.println("Exception handled");
		}
	}

}
