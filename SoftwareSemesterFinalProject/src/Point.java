import java.awt.Window.Type;
import java.util.ArrayList;

import org.junit.experimental.theories.Theories;

public class Point 
{
	public int getPointCount (ArrayList<TimeData> timeData)throws WrongMachineTypeException
	{
		int currentIndex = 3;
		int returnVaiue = 0;
		int getPointLastIndex=0;

		
		if(ifDataHaveError(timeData))
		{
			returnVaiue = -1;
			throw new WrongMachineTypeException();
		}
		else if(ifSizeLessThanFour(timeData))
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
					getPointLastIndex = currentIndex;
					returnVaiue++;
					currentIndex++;
					while(currentIndex < timeData.size())
					{
						if(ifBeyondOneHour(timeData.get(getPointLastIndex), timeData.get(currentIndex)))
						{
							currentIndex = currentIndex+3;
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
		if( ifBeyondHalfHour(data1,data2) && ifBeyondHalfHour(data1,data3) && ifBeyondHalfHour(data1,data4))
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
		 	if((data2.getMinutes() - data1.getMinutes()) <= 30)
		 	{
		 		returnValue = true;
		 	}
		}
		else
		{
			if((data2.getHours() - data1.getHours()) >1)
			{
				returnValue = false;
			}
			else
			{
				if((data2.getMinutes() + 60 -data1.getMinutes()) <= 30 )
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
	
	private boolean ifDataHaveError(ArrayList<TimeData> timeData) 
	{
		boolean returnValue = false;
		char temp = timeData.get(0).getMachibeType();
		for(int i = 1; i < timeData.size();i++)
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
	}
	
	/*public static void main(String args[]) 
	{
		
		
			ArrayList<TimeData> testData1 = new ArrayList<>();
			testData1.add(0,new TimeData(00, 9, 'A'));
			testData1.add(1,new TimeData(10, 9, 'B'));
			testData1.add(2,new TimeData(20, 9, 'A'));
			testData1.add(3,new TimeData(31, 9, 'B'));
			testData1.add(4,new TimeData(39, 9, 'A'));
			
			Point testCase1 = new Point();
			System.out.println(testCase1.getPointCount(testData1));
		
	
	}*/
	
	


}
