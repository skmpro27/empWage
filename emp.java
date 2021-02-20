
public class emp {
	public static void main( String[] args ) {
		int IS_FULL_TIME = 1;
		int empCheck = (int) (Math.random() * 10) % 2; //uc1
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Abscent");
		int daily = 20*8;
		System.out.println("Daily Wages for 8 hrs work: " + daily); //uc2
	}
}
