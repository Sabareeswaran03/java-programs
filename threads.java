package practice_java;

class  a extends Thread{
	public void run(){
		for(int i=1;i<=10;i=i+1) {
			System.out.println("hai...");
		}
	}
}
class b extends Thread{
	
		public void run(){
			for(int i=1;i<=10;i=i+1) {
				System.out.println("bye.");
				
			}
	}
}
public class threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a obj=new a();
b obj1=new b();
obj.start();
obj1.start();
	}

}
