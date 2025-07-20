package practice_java;

interface playable{
	void play();
	
}
class jitar implements playable{
	public void play() {
		System.out.println("qitar");
	}
}
class plute implements playable{
		public void play() {
			System.out.println("vsiline");
		}
	
}

public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
jitar j=new jitar();
j.play();
plute p=new plute();
p.play();
	}

}
