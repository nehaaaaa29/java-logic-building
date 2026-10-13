// Find the HCF (Highest Common Factor) of two given numbers. 

import java.util.Scanner;

public class whileloop26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the  number to know its factors:");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int hcf=1;
        int i=hcf;
     
       
        while(i<=a){
            if( a % i==0  && b% i==0 ){

                if(i>hcf){
                    hcf=i;
                }
                
            }
            
            i++;
        }
        System.out.println( "highest common factor is "+hcf);
        
        

    }
    
}
