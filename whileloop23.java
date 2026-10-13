import java.util.Scanner;
//Print all numbers between a and b that are divisible by 7. 
public class whileloop23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  2 number two check how many numbers in between are divisible by 7.\n Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int i=a;
        while(i<=b){
            if(i % 7 == 0 ){
                System.out.println(i);
            }
            i++;
        }

    }
    
}
