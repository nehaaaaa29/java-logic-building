import java.util.Scanner;

public class sumofevenandodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int evensum=0;
      int oddsum=0;
      do { 
        int digit=n%10;
            if(digit%2==0){
                evensum=evensum+digit;
            }else{
                oddsum=oddsum+digit;
            }
n=n/10;
          
      } while (n>0);
      System.out.println("even digits sum:"+evensum);
      System.out.println("odd digit sum:"+oddsum);


     }
}
