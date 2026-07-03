// Check whether the given number is a Perfect number.

import java.util.Scanner;

public class whileloop16 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int sum=0;
        int i=1;
        while(i<n){
              if(n%i==0){
                sum=sum+i;
              }
              i++;
        }
       if(sum==n){
        System.out.println("It is a perfect number");
       }else{
        System.out.println("It is not");
       }
    }
}
