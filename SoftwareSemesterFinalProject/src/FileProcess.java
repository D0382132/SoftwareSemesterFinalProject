import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class FileProcess 
{
	private List<String> memberLoadData;
	private int dataIndex;
	
	 public  FileProcess() 
	 {
		 this.memberLoadData = new ArrayList<String>();
		 this.dataIndex = -1;
	 }
	
	private boolean readFile()
	{
		boolean returnBoolean = true;
		try
		{
			FileReader fr=new FileReader("memberData.txt");
			BufferedReader br=new BufferedReader(fr);
			String line = null;
			 
		     while ((line = br.readLine()) != null) 
		     {
		            this.memberLoadData.add(line);
		     }
		}
		catch(IOException e)
		{
			System.out.println(e);
			returnBoolean = false;
		}
		return returnBoolean;
	}
	

}
