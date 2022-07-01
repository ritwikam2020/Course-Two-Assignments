package LiveAssignments.classFour;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileIOStream {
	public static void main(String[] args)
	{
		String file = "C://Users//ritwi//Documents//GitHub//PGP-FSD//Course2 Assignments//Test3.txt";
		DataInputStream dis=new DataInputStream(System.in);
		try
		{
			FileOutputStream fout=new FileOutputStream(file,true);
			BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
			System.out.println("Enter text (@ at the end):"); 
	        char ch;
	        while((ch=(char)dis.read())!='@') 
	        { 
	            bout.write(ch); 
	        } 
	        bout.write('\n');
	        //close the file 
	        bout.close(); 	
	        FileInputStream fin= new FileInputStream(file);
	        System.out.println("FileContents :");
	        int ch1; 
	        while((ch1=fin.read())!=-1) 
	            System.out.print((char)ch1); 
	          
	        //close the file 
	        fin.close(); 
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
	}

}
