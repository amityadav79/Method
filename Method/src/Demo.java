import org.studyeasy.Calculate;

public class Demo {

	public static void main(String[] args) {
		
		Calculate prime = new Calculate();
		if(prime.isPrime(7)) {
			System.out.println("Number Passed is Prime");
		}else {
			System.out.println("Number  Passed is not Prime");
		}
	}

}
