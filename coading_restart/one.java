import java.util.Scanner;

public class one {
   
    public void check_positive(int num){
        if(num>0){
            System.out.println("positive");

        }
        else if(num<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
    public void even_odd(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else if(num%2!=0){
            System.out.println("odd");
        }
        else{
            System.out.println("negative");
        }
    }

    public void greater_num(int num,int num2){
        if(num>num2){
            System.out.println(num+" is greater");
        }
        else{
            System.out.println(num2+" is greater");
        }
    }
    public void greater_three(int num,int num2,int num3){
        
    }

    public static void leapyear(int year){
        if(year%4==0 && year %100 != 0 ||year%400==0){
            System.out.println("yes it's leap year");
        }
        else{
            System.out.println("not leap year");
        }

    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("enter year to check its prime or not");
        int yearr=sc.nextInt();
        leapyear(yearr);
        
    }

}
