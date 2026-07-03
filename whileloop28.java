import java.util.Scanner;
// Find the smallest digit in the given number. 
public class whileloop28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          int smallest=9;  
        while(n>0){
            int digit= n%10;
             
            if(smallest>digit){
                smallest=digit;

            }
            n=n/10;
        }
        System.out.println(smallest);

              
    }
}
