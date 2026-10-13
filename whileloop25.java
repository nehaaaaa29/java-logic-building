//Find and print the sum of all factors of the given number. 

import java.util.Scanner;

public class whileloop25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the  number to know its sum of factors:");
        int a=sc.nextInt();
        int sum=0;
        int i=1;
        System.out.println();
        System.out.print("factors are:");
        while(i<=a){
            if(a % i == 0 ){
                System.out.print(i+" ");
                sum=sum+i;
            }
            i++;
        }
        System.out.println();
        System.out.println("sum of factors:"+sum);

    }
    
}
