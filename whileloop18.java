//check wheateher given number is prime or not

import java.util.Scanner;

public class whileloop18 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int i=2;
        boolean isprime=true;
         while(i<a){
            
            if(a%i==0){
                isprime=false;
               
                break;
                
               
            }
            
          
        i++;
         }
          if(isprime){
            System.out.println("prime");
           
           }  
           else{
            System.out.println("notprime");
           }
    }
    
}
