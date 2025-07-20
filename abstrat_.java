package practice_java;
abstract class vehile{
	String name;
	abstract void speed();
	vehile(String name){
		this.name=name;
	}
}
class car extends vehile
{
	car(String name)
	{
		super(name);
	}
	void speed(){
		System.out.println("25km/hr");
	}
}

public class abstrat_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car c=new car("audi");
System.out.println(c.name);
c.speed();
}

}
