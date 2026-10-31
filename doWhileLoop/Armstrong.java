
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=n;
        int j=n;
        double sum=0;
        int count=0;

        do { int num =i%10;
            count++;
            i=i/10;
        } while (i>0);
        

     do { 
          int digit=j%10;
          sum=sum+(Math.pow(digit,count));
         j=j/10;
     } while (j>0);
     if(sum == n){
        System.out.println("it is a armstrong num");
     }else{
        System.out.println("It is not");
     }

    }
    
}
