//calculate factorial of given number

import java.util.Scanner;

public class whileloop9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number for factorial");
        int n =sc.nextInt();
        int i=1;
        int fact=1;
        while(i<=n){
             fact=fact*i;
             i++;
        }
        System.out.println(fact);
    }
    
}
