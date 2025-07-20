import java.util.Scanner;
public class ternary{
public static void main(String[]args)
{
Scanner car =new Scanner(System.in);
 int a= car.nextInt();
int b= car.nextInt();
boolean c= (a>b);

String result=c?"greater":"not greater";

     System.out.println(result);
}
}


