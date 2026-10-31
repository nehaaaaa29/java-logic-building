public class recursionAllPractice {

 public static int oneToN(int n){

    if(n>10){
        return n;
    }
   System.out.println(n);
   int num=oneToN(n+1);
   return num;

 }

 public static int nToOne(int n){
    if(n>10){
        return n;
    }

    int num=nToOne(n+1);
    System.out.println(n);
    return num;

 }
  public static int even(int n){

    if(n>10){
        return n;
    }
    if(n%2==0){
           System.out.println(n);
    }
  
  even(n+1);
   return 0;

 }
 public static int odd(int n){

    if(n>10){
        return n;
    }
    if(n%2!=0){
           System.out.println(n);
    }
  
  odd(n+1);
   return 0;

 }
 public  static int sum(int n){
   int summ =0;

    if(n==0){
        return 0;
    }
    int add= sum(n-1);
    summ=add+n;
   
    
    
    return summ;
 }

 public static int fact(int n){
     int factorial=1;
    if(n==0){
        return 1;
    }
    int facto=fact(n-1);
    factorial=facto*n;
    return factorial;
 }

 public static int fibbo(int n){
  
      if ( n ==0)
        return  0;
      
      if( n==1)
        return 1;
      
     return fibbo(n-1)+fibbo(n-2);
     


 }
 public static void fib(int prev ,int curr , int n){
    if(n==0)
        return ;
    
    System.out.println(prev);
   fib (curr,curr+prev , n-1);
    
   

 }



    public static void main(String[] args) {
      //  int n=5;
     // oneToN(n);
      //nToOne(n);
      //even(n);
      // odd(n);
     //System.out.println(sum(n));
    // System.out.println(fact(n));
   // System.out.println(fibbo(n));
        fib(0,1,5);
   
    }
    
}
