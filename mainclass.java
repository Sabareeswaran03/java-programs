package practice_java;
class person{
	public String name;
	protected int age;
	private String ssn;
	String address;
	
	 
	
	person(String name,int age,String ssn,String address){
		this .name=name;
		this.age=age;
		this.address =address;
		this.ssn =ssn;
	}

	public String getssn() {
		return ssn;
	}
}
class employee extends person{
	employee(String name,int age,String ssn,String address){
		
	
	super(name,age,ssn,address);
	
	}
}

public class mainclass {

	public static void main(String[] args) {
		
employee e1=new employee("john",22,"jfdjh","kovai");

System.out.println(e1.name);
System.out.println(e1.age);
System.out.println(e1.getssn());
System.out.println(e1.address);
	}

}
