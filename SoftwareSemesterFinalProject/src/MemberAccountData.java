
import java.io.*;
import java.sql.Time;
import java.util.ArrayList;
import java.lang.Character;
public class MemberAccountData 

{
	private String account ;
	private String password;
	private int point;
	
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
