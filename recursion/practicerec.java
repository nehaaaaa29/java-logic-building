public class practicerec {
//factorial
/*public static int facto(int n){

    if(n==0){
         return 1;
    }
    int fact=facto(n-1);
    int factorial=n*fact;
    return factorial;
}*/
public static int sum(int n){
    if(n==0){
        return 0;
    }
    int add=sum( n-1);
    int res=n+add;
    return res;
}
public static int fiboo(int n){
    if(n==0 || n==1){
        return n;
    }
    int prev=fiboo(n-1);
    int next=fiboo(n-2);
    int fibo=prev+next;
    
    return fibo;
   

}
    public static void main(String[] args) {
        int n=5;

        int sum=sum(n);
      //  System.out.println(sum);

        int res =fiboo(n);
        System.out.println(res);

    }
    
}
