package practice_java;


class animal{
	animal(int age,int age2){
		System.out.println(age+age2);
	}
	void barks(){
		System.out.println("dog barks");
		
	}
} class dog extends animal{
	dog(){
	   super(15,25);
		super.barks();
	}
}
public class other_inheritance {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
dog b=new dog();
	}

}
