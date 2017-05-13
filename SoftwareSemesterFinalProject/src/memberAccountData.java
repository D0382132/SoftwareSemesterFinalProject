
import java.io.*;
import java.sql.Time;
import java.util.ArrayList;
import java.lang.Character;
public class memberAccountData 

{
	private String account ;
	private String password;
	private int point;
	
	/*public boolean creatAccount(String inputAccount , String inputPassword )
	{
		this.account = new String(inputAccount);
		this.password = new String(inputPassword);
		this.point = 0;
		
	}*/
	
	private boolean readFile(String inputAccount)
	{
		boolean returnBoolean = false;
		try
		{
			FileReader fr=new FileReader("memberData.txt");
			BufferedReader br=new BufferedReader(fr);
			String line;
			 
		      while (( line = br.readLine()) != null) 
		      {
		    	  String[] subLine = line.split("/");
		          if(compareAccount(subLine[0]))
		          {
		        	 this.account = subLine[0];
		        	 this.password = subLine[1];
		        	 char temp = subLine[2].charAt(0);
		        	 this.point = Character.getNumericValue(temp);
		        	 returnBoolean = true;
		          }
		      }
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		if(account == null)
		{
			returnBoolean = false;	
		}
		
		return returnBoolean;
	}
	
	public boolean compareAccount (String inputAccount)
	{
		boolean returnValue;
		if(account.compareTo(inputAccount) == 0) 
			returnValue = true;
		else
			returnValue = false;
		
		return returnValue;
	}
	public boolean comparePassword (String inputPassword)
	{
		boolean returnValue;
		if(password.compareTo(inputPassword) == 0) 
			returnValue = true;
		else
			returnValue = false;
		
		return returnValue;
	}
	public int getPoint()
	{
		return point;
	}
	public void addPoint() 
	{
		this.point = this.point + 1;
	}

}
