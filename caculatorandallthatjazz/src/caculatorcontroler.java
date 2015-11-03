
public class caculatorcontroler {

	public static void main(String[] args) {
		float nOne;
		float nTwo;
		caculator testmk1 = new caculator();
		nOne= Float.parseFloat(args[0]);
		nTwo= Float.parseFloat(args[1]);
		testmk1.setNumOne(nOne);
		testmk1.setNumTwo(nTwo);
		System.out.println("The add is: "+ testmk1.add());
		System.out.println("The minus is: "+ testmk1.minus());
		System.out.println("The times is: "+ testmk1.times());
		System.out.println("The devide is: "+ testmk1.devide());
	}
}
