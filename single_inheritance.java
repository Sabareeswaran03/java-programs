package practice_java;
class a{
	int one =1;
}
class b extends a{
	int two=2;
}
class c extends b{
	int three= one+two;
}
public class single_inheritance {

	public static void main(String[] args) {
		
c obj=new c();
System.out.println(obj.three);
	}

}
