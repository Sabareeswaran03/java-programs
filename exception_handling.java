package practice_java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exception_handling {

	public static void main(String[] args) {
		Scanner j=new Scanner(System.in);
		try {
			int a=j.nextInt();
			int b=a/0;
		}
		catch(InputMismatchException c) {
			System.out.println("need integer values"+c);
		
		}
		catch (ArithmeticException c) {
			System.out.println("not divisible"+c);
		}
System.out.println("end");
	}

}
