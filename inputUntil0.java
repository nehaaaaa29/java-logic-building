
import java.util.Scanner;

public class inputUntil0 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int a;
        System.out.println("enter number as many as you want  if you ll enter 0 i ll give you the sum of all previous entered numbers");
        do { 
             a =sc.nextInt();
            if(a>0){
              sum=sum+a;
            }
            else{
                break;
            }
        } while (a>0);
    
    System.out.println("Sum of entered number:"+sum);
    }
    
}
