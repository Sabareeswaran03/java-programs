import java.util.Scanner;
public class arrray{
public static void main(String[]args){
    Scanner car=new Scanner(System.in);

     int[] marks=new int[5];

    for(int i=0;i<=4;i=i+1)
    {

    
    marks[i]= car.nextInt();
    }
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);
}}