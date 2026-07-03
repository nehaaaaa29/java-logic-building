
//Find and print the sum of the Fibonacci series up to n terms. 

import java.util.Scanner;

public class whileloop20 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        
       int prev=0;
       int next=1;
       
       int fibo=0;
       System.out.println(prev);
       System.out.println(next);
       int sum=prev+next;
       while(next<n){
      
      fibo=prev+next;
       System.out.println(fibo);
      
      prev=next;
      next=fibo;
       sum=sum+fibo;
        }
        System.out.println(sum);
       }
        
}
