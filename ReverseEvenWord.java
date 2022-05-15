package week3.Day;


import jdk.intenal.joptsimple.internal.strings;


public class ReverseEvenWord {

	public static void main(String[] args) {
		String test = " I am a software tester";
		
		string[] arrofstr = test.split("",-1);
		string[] output = new String[5];
		
		int i=0;
		for(i=0;i<arrofstr.length;i++)
		{
			String CurrentString = arrofStr[i];
			
			
			if(i%2==0)
			{
				OutPut[i]=CurrentString;
				
			}
			else
			{
				string reverse ="";
				 int j=0;
				 
				 for (j=CurrentSring.length()-1;j>=0;j--)
				 {
					 reverse = reverse + CurrentString.charAt(j);
				 }
				 
				 Output[i]=reverse;
			}
		}
		string join = String.join("",Output);
		System.out.print1n(join);
		
		
	
}

}
