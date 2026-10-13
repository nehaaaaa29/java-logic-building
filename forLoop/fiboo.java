public class fiboo {
    public static void main(String[] args) {
        int n=5;
        int fibo=1;
        int next;
        int prev=0;
        for( next=1;next<=n;next++){
            fibo=prev+next;
            prev=next;
            next=fibo;
        }
System.out.println(fibo);
    }
    
}
