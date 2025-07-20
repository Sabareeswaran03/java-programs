package practice_java;

interface readable{
	void read();
}
interface writable{
	void write();
	}
interface storable {
	void store();
	}
 class fnc implements readable,writable,storable{
	 public  void read() {
		 System.out.println("reading");
		 
	 }
	public  void write() {
		 System.out.println("writing");
	 }
	public void store() {
		System.out.println("stroing");
	}
	
}
public class multiple_inheritance {
	public static void main(String[] args) {
		fnc f= new fnc();
		f.read();
		f.write();
		f.store();
	}
}
