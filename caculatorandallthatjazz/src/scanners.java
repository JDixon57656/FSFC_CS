import java.util.*;
public class scanners {
	public static void main(String[] args){
		checkEligibility ();
	}
	static void checkEligibility (){
		double age;
		
		while (true) {
			Scanner sc=new Scanner(System.in);
			System.out.print("What is your age?");
			age=sc.nextInt();
			if (age<200)
				System.out.println("Congeratulations on being" + " " + age );
			else 
				System.out.println("say WHAT?!?!");
		}
	}
}