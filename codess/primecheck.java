
import java.util.Scanner;

//Check whether a number is prime.
public class primecheck {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        checkPrime(n);

    }

 public static void checkPrime(int n){
      if(n<=1){
        System.out.println("It is not a prime number");
    }

     boolean isprime=true;

    for(int i =2;i<=n/2;i++){
      
        if(n % i == 0){
          isprime=false;
          break;
        }
    }
   
    if(isprime){
        System.out.println("the Number is prime");
    }
    else{
        System.out.println("it is not a prime");
    }
 }
   
}



