package LiveAssignments.classFour;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class FileInputEg {
	public static void main(String[] args)
	{
		String file = "C://Users//ritwi//Documents//GitHub//PGP-FSD//Course2 Assignments//Test2.txt";
		char[] read = new char[60];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file info");
		String write = sc.nextLine();
		try
		{
			FileWriter fl = new FileWriter(file);
			fl.write(write);
			fl.close();
			FileReader fl1 = new FileReader(file);
			fl1.read(read);
			System.out.println("output from file");
			System.out.println(read);
			fl1.close();	
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
	}

}
