//count and print total number of digits

import java.util.Scanner;

public class whileloop11 {
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
     
        int count=0;
         while(n>0){
            int digit=n%10;
            count++;
           
            n=n/10;
           
         }
         System.out.println(count);

    }
    

}
