import java.util.Scanner;

public class whileloop29 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          int largest=0;  
        while(n>0){
            int digit= n%10;
             
            if(largest<digit){
                largest=digit;

            }
            n=n/10;
        }
        System.out.println(largest);

              
    }
}
