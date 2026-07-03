
import java.util.Scanner;

// Print the multiplication table of a given number.
public class multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do { 
            System.out.println(n*i);
            i++;
        } while (i<=10);
    }

    
    
}
