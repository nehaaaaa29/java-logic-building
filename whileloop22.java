import java.util.Scanner;

public class whileloop22 {
    

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number:");

    int n=sc.nextInt();
    int i=1;
    while(i<=n){
        int cube=i*i*i;
        System.out.println(cube);
        i++;
    }
    
}
}
