import java.util.Scanner;
public class  getinput{
public static void main(String[]args)
{
Scanner car=new Scanner(System.in);

String name=car.nextLine();
int age=car.nextInt();

String address=car.nextLine();
double score=car.nextDouble();
System.out.println("my name is"+ name);
System.out.println(" my age is :" +age);
System.out.println(" my address is :"+address);
System.out.println(" my score is :" +score/10);
}
}
