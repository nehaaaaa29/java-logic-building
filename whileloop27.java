// Find the LCM (Least Common Multiple) of two given numbers.

import java.util.Scanner;

public class whileloop27 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the  number to know its factors:");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int lcm=1;
        int i=lcm;
        
        int l=0;
        int m=0;
       while(i<10){
         l=a*i;
         int j=1;
        while(j<10){
              m=b*j;
              
        if(l==m){
            System.out.println(l);
            return;
        }
        j++;
        }
        i++;
    

       }

    }
    
}
