package userDefinedException;

public class MainClass {

	public static void validateAge(int age) throws MyException {
		if (age < 18) {
			throw new MyException("You are not eligible to vote");
		} else {
			System.out.println("You are eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(16);
		} catch (MyException ex) {
			System.out.println("Caught the exception");
			System.out.println("Exception occured at " + ex);
		}
		System.out.println("Rest of the code");
	}

}
