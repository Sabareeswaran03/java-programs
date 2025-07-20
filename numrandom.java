import java.util.Random;
public class numrandom{
    public static void main(String[]args){
    Random car=new Random();
   int num=0;
    while(num!=7){
        num = car.nextInt(11);
     
    
        System.out.println(num);
    

    }
    }
}