import java.util.Scanner;

public class Streamsubscription {

static int a;
	
	public static void main(String[] args) {
		
		//Ram needs to provide the budget amount as input value
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter your budget for the Straming Services:");
	        a = inp.nextInt();
		plan(); 
		   
	}

	public static void plan()
	{
		//First Case: When Ram enters the amount which is less than 999.
		
		if(a<999)
		{
			System.out.println("No Plans Available");
		}
		
		// Second Case: When Ram entered the amount which is in between 999 and 1946.
		
		else if (a>=999 && a<=1946)
		{
			System.out.println("The following streaming subsribtion plans are available:");
			System.out.println("1. Prime Video 1x annual subscription - 999\r\n" + 
			        "Or\r\n" +
					"2. Zee5 1x annual subscription - 999\r\n" + 
			        "Or\r\n" +
					"3. Sony liv 1x annual subscription - 999");
		}
		
		//Third Case: When Ram entered the amount which is in between 1947 and 2999.
		
		else if (a>1946 && a<3000)
		{
			System.out.println("The following streaming subsribtion plans are available:");
			System.out.println("1. Netflix 3x standard monthly plan - 1947\r\n" +
			        "Or\r\n" +
					"Any two plan from below mentioned set can be availed:\r\n" +
					"2a. Prime Video 1x annual subscription - 999\r\n" + 
					"2b. Zee5 1x annual subscription - 999\r\n" + 
					"2c. Sony liv 1x annual subscription - 999"  );
	     }
		
		//Fourth Case: When Ram entered 3000 amount.
		
		else if(a==3000)
		{
			System.out.println("The following streaming subsribtion plans are available:");
			System.out.println("1. Netflix 3x standard monthly plan - 1947\r\n" +
			        "And\r\n" +
					"Any 1 plan from below mentioned set can be availed:\r\n" +
					"1a. Prime Video 1x annual subscription - 999\r\n" + 
					"1b. Zee5 1x annual subscription - 999\r\n" + 
					"1c. Sony liv 1x annual subscription - 999\r\n" +
					"Or\r\n" +
					"All the below mentioned plans can be availed:\r\n" + 
					 "2a. Prime Video 1x annual subscription - 999\r\n" + 
					 "2b. Zee5 1x annual subscription - 999\r\n" + 
					 "2c. Sony liv 1x annual subscription - 999");
		}
		
		//Fifth Case: When Ram entered the amount which is in between 3001 and 4943.
		
		else if(a>3000 && a<=4943)
		{
			System.out.println("The following streaming subsribtion plans are available:");	
			System.out.println("1. Netflix 3x standard monthly plan - 1947\r\n" +
			        "And\r\n" +
					"Any 2 plans from below mentioned set can be availed:\r\n" +
					"1a. Prime Video 1x annual subscription - 999\r\n" + 
					"1b. Zee5 1x annual subscription - 999\r\n" + 
					"1c. Sony liv 1x annual subscription - 999");
		}
		
		//Sixth Case: When Ram entered the amount which is greater than 4944.
		
		else if (a>=4944 && a>=5000)
		{
			System.out.println("All the following streaming subsribtion plans can be availed:");
			System.out.println("1. Prime Video 1x annual subscription - 999\r\n" + 
					"2. Zee5 1x annual subscription - 999\r\n" + 
					"3. Sony liv 1x annual subscription - 999\r\n" + 
					"4. Netflix 3x standard monthly plan - 1947");
		}
		
		//Seventh Case: When Ram enters any invalid input.
		
		else
		{
			System.out.println("No valid input value");
		}
		
}
}
