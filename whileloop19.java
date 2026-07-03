//Print the Fibonacci series up to n terms.

import java.util.Scanner;

public class whileloop19 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        
       int prev=0;
       int next=1;
       int fibo=0;
       System.out.println(prev);
       System.out.println(next);
       while(next<n){

      fibo=prev+next;
       System.out.println(fibo);
      prev=next;
      next=fibo;
        }
       }
        

    }
    

