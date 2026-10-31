import java.util.Scanner;

public class negativeNumber {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int a;
       do { 
            a=sc .nextInt();
           if(a>0){
            count++;
            
           }
       } while (a>0); 
       System.out.println(count);
       
     }
}
