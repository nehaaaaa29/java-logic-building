//Print all factors of the given number. 

import java.util.Scanner;

public class whileloop24 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the  number to know its factors:");
        int a=sc.nextInt();
        
        int i=1;
        while(i<=a){
            if(a % i == 0 ){
                System.out.println(i);
            }
            i++;
        }

    }
    
}
