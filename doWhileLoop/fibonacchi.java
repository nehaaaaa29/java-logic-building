//9. Calculate and print the fibbo  of the given number. 

import java.util.Scanner;

public class fibonacchi {
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int prev=0;
        int next=1;
        int fibo=0;
        System.out.println(prev);
        System.out.println(next);
        do { 
            fibo=prev+next;
            prev=next;
            next=fibo;
            System.out.println(fibo);
           
        } while (next<n);
    }
}
