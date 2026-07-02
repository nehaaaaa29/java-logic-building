//Check whether the given number is an Armstrong number.

import java.util.Scanner;

public class whileloop15 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int j=n;
        int i =n;
        double sum=0;
        double count=0;
        
        while(i>0){
            int digit=i%10;
            count++; 
           
            i=i/10;
        }
        while(j>0){
             
             double digit=j%10;
              sum=sum+(Math.pow(digit, count));
              j=j/10;



        }
        if(n==sum){
            System.out.println("it is armstrong");

        }
    else{
        System.out.println("it is not");
    }
}
}
