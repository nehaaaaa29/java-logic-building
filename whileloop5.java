
import java.util.Scanner;

//print the table of given number from n*1 to n*10
public class whileloop5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number for table:");
        int n= sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n +" * "+ i +" = "+n*i);
            i++;
        }
        
    }

}
