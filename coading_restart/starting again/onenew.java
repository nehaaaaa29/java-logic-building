//Print numbers from 1 to N, but print “Fizz” for multiples of 3, “Buzz” for multiples of 5, “FizzBuzz” for both.
import java.util.Scanner;


public class onenew {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1; i<=n;i++){
               if(i%3 ==0 && i%5 ==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3 ==0){
                System.out.println("Fizz");
            }
            else if(i%5 ==0){
                System.out.println("Buzz");
            }
            else if(i%3 ==0 && i%5 ==0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }




    }
}
