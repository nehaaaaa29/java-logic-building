
import java.util.Scanner;

//Print the square of each number from 1 to n. 
public class whileloop21 {
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number:");

    int n=sc.nextInt();
    int i=1;
    while(i<=n){
        int square=i*i;
        System.out.println(square);
        i++;
    }
    
}

}
