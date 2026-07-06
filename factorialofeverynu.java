//Calculate and print the factorial of every number from 1 to n.
import java.util.Scanner;

public class factorialofeverynu {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){

           int fact=1;
            for(int j=1;j<=i;j++){
                
                fact=fact*j;
            }
             System.out.println("factorial of:"+i+" "+fact);
           
        }
        
    }
    
        
    }
    

