
import java.util.Scanner;

public class whileloop10 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int prod =1;
         while(n>0){
            int digit=n%10;
            prod=prod*digit;
            n=n/10;
           
         }
         System.out.println(prod);

    }
}
