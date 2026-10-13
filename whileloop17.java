public class whileloop17 {
    public static void main(String[] args) {
     int n=2;
     while(n<=100){
        boolean isprime=true;
        int i=2;
      while(i<n){
        if(n%i==0){
            isprime=false;
          break;
        }
         
        i++;

      }
      


     
     
    if(isprime){
        System.out.println(n);
    }
    n++;
}
}
}
