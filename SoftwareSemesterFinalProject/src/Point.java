import java.util.ArrayList;

public class Point 
{
	public int getPointCount (ArrayList<TimeData> timeData)
	{
		int currentIndex = 3;
		int returnVaiue = 0;
		
		if(ifSizeLessThanFour(timeData))
		{
			returnVaiue = 0;
		}
		else
		{
			while(currentIndex < timeData.size())
			{
				if(ifGetPoint(timeData.get(currentIndex-3), timeData.get(currentIndex-2), 
						timeData.get(currentIndex-1), timeData.get(currentIndex)))
				{
					returnVaiue++;
					while(currentIndex < timeData.size())
					{
						if(ifBeyondOneHour(timeData.get(currentIndex), timeData.get(currentIndex+1)))
						{
							currentIndex = currentIndex+1;
							break;
						}
						else
						{
							currentIndex = currentIndex+1;
						}
					}
				
				}
				else
				{
					currentIndex++;
				}
			}
			
		}
		
		
		if(returnVaiue > 5)
		{
			returnVaiue = 5;
		}
		
		
		
		
	return returnVaiue;
		
		
		
	}
	private boolean ifSizeLessThanFour(ArrayList<TimeData> timeData) 
	{
		boolean returnValue = false;
		if(timeData.size()<4)
		{
			returnValue = true;
		}
		return returnValue;
	}
	
	
	private boolean ifGetPoint(TimeData data1,TimeData data2,TimeData data3,TimeData data4)
	{
		boolean returnValue = false;
		if( !ifBeyondHalfHour(data1,data2) && !ifBeyondHalfHour(data1,data3) && !ifBeyondHalfHour(data1,data4))
		{
			returnValue = true;
		}
		return returnValue;
		
	}
	
	private boolean ifBeyondHalfHour(TimeData data1,TimeData data2)
	{
		boolean returnValue = false;
		if( data1.getHours() == data2.getHours())
		{
		 	if((data2.getMinutes() - data1.getMinutes()) > 30)
		 	{
		 		returnValue = true;
		 	}
		}
		else
		{
			if((data2.getHours() - data1.getHours()) >1)
			{
				returnValue = true;
			}
			else
			{
				if((data2.getMinutes() + 60 -data1.getMinutes()) > 30 )
				{
					returnValue = true;
				}
			}
		}
		
		return returnValue;
	}
	
	private boolean ifBeyondOneHour(TimeData data1,TimeData data2)
	{
		boolean returnValue = false;
		if((data2.getHours() - data1.getHours())>1)
		{
			returnValue = true;
		}
		else if((data2.getHours() - data1.getHours()) == 1)
		{
			if((data2.getMinutes() + 60 - data1.getMinutes())>=60)
			{
				returnValue = true;
			}
		}
		return returnValue;
		
	}
	
	/*private boolean ifDataHaveError(ArrayList<TimeData> timeData) 
	{
		boolean returnValue = false;
		char temp = 'B';
		for(int i = 0; i < timeData.size();i++)
		{
			if( temp != timeData.get(i).getMachibeType())
			{
				temp = timeData.get(i).getMachibeType();
			}
			else
			{
				returnValue = true;
				break;
			}
		}
		
		return returnValue;
	}*/
	

}
