
public class scanners {
	public static void main(String[] args)
		checkEligibility ();
	}
	static void checkEligibility (){
		int age;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("What is your age?");
		age=sc.nextlnt();
		if (age>=18)
			System.out.println("18 or more")
		else
			System.out.println("17 years old or yonger")
			
	}

