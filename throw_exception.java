package practice_java;
import java.util.Scanner;
public class throw_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
try {
	int a=s.nextInt();
	if(a<=0) {
		throw new ArithmeticException("leeser age");
	}
	
}catch(Exception e) {
	System.out.println(e);
}
	}

}
