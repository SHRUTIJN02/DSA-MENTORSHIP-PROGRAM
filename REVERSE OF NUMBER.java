import java.util.Scanner;
public class Program6 {
    public static void main(String ar[]){
        Scanner s1=new Scanner(System.in);
        int rev=0,rem=0;
        System.out.println("enter the number");
        int num=s1.nextInt();
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
    System.out.println(rev);
    }
}
