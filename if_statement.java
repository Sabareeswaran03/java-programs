import java.util.Scanner;
public class if_statement{
public static void main(String[]args)
{
Scanner car=new Scanner(System.in);
int score=car.nextInt();
if(score>=35 && score<=50)
{
System.out.println("average");
}
else if(score>=50 && score<=75)
{
System.out.println("good");
}
else
{
System.out.println("weldone");
}
}
}
