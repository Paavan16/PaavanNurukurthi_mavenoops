package task2;

public class dairychoc implements interface1{
	
	public int wtofchoc(int two,int weight)
	{
		two+=weight;
		return  two;
	}
	
	public int noofcandy(int small,int big,int ct,int weight)
	{
		if(weight>=small && weight<=big)
		{
			ct++;
		}
	return ct;	
	}

}
