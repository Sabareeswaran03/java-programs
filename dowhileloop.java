import java.util.Scanner;

public class dowhileloop{
    public static void main(String[]args){
        Scanner car=new Scanner(System.in);
        int i;
        do{
            System.out.print("need greater num");
            i=car.nextInt();

        }while(i<10);


    }

}
