import java.util.Scanner;

public class Program9 {
    public static void main(String ar[]){
     System.out.println("Enter number1: ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter number2: ");
        int n2=sc.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1%n2!=0)
        {
            int r=n1%n2;
            n1=n2;
            n2=r;
        }
        int gcd=n2;
        int lcm=(on1*on2)/gcd;
        System.out.println("The HCF is "+gcd);
        System.out.println("The LCM is "+lcm);

 }
}
