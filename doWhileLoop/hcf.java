import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=1;
        int res=0;
        int hcf=1;
        do { 
             if( a % i==0  && b% i==0 ){

                if(i>hcf){
                    hcf=i;
                }
                
            }
             i++;

            
        } while (i<=b);
        System.out.println(hcf);
    }
    
}
