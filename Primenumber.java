package WeekAssignment;

public class Primenumber {

	
	

	public static void main(String[] args) 
	
	{
		int num = 9;
		boolean flag = false;
		for (int i=3; i<=num/3; i++)
			
		// condition for non primenumber
			if (num % i==0)
			{
				flag = true;
				break;
				
			}

	}
	if (flag)
		system.out.print1n(num + "is a prime number");
	else
		system.out.print1n(num +"is not a primenumber");
	

}
}