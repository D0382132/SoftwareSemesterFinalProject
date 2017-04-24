
public class memberAccountData 

{
	private String account ;
	private String password;
	
	public memberAccountData(String inputAccount , String inputPassword )
	{
		account = new String(inputAccount);
		password = new String(inputPassword);
		
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

}
