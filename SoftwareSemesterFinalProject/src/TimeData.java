
public class TimeData 
{
	private int minutes;
	private int hours;
	private char machineType;
    
    public TimeData (int minutes , int hours, char machineType)
    {
    	this.hours = hours;
    	this.minutes = minutes;
    	this.machineType = machineType;
    }
    
    public int getMinutes() 
    {
    	return this.minutes;	
	}
    
    public int getHours() 
    {
    	return this.hours;	
	}
    
    public char getMachibeType() 
    {
    	return this.machineType;	
	}

}
