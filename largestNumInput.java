import java.util.Scanner;

public class largestNumInput {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int a;
        int largest=0;
        System.out.println("enter number as many as you want  if you ll enter 0 i ll give you the sum of all previous entered numbers");
        do { 
             a =sc.nextInt();
            if(largest<a){
              largest=a;
            }
           
        } while (a>0);
    
    System.out.println("largest entered number:"+largest);
    }
    
    
}
