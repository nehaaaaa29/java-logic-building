import java.util.Scanner;

public class sumofdigits {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int sum=0;
      do { 
        int digit=n%10;
sum=sum+digit;
n=n/10;
          
      } while (n>0);
      System.out.println(s);


     }
}
