package fileHandlings;

import java.io.*;

public class FileWriting {

	public static void main(String[] args) {

		try {
			FileWriter f=new FileWriter("D:\\java\\eclipse\\CreateAJavaFile.txt");
			//PrintWriter f=new PrintWriter("D:\\java\\eclipse\\CreateFile.txt");
			//FileOutputStream f=new FileOutputStream("D:\\java\\eclipse\\CreateFile.txt");
			//BufferedWriter bw=new BufferedWriter(f);

			try {
				f.write("Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.\r\n"
						+ "\r\n"
						+ "Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java.\r\n"
						+ "\r\n"
						+ "Platform: Any hardware or software environment in which a program runs, is known as a platform. Since Java has a runtime environment (JRE) and API, it is called a platform. ");
				//f.write(97);// FileOutputStream take only integer type data

			}
			finally {
				f.close();
			}

			System.out.println("Successfully Data wrote in a File");

		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}
}
