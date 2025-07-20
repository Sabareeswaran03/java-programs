package practice_java;
interface s{
	void hello();
}
public class lambda {
public static void main(String[]args) {
	s obj=()->{
		System.out.println("hello");
	};
	
	obj.hello();
	
}
}
