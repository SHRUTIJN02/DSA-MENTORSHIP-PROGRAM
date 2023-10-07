import java.util.Scanner;

public class Program7 {
    public static void main(String ar[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number");
        int num=s1.nextInt();
        int count=0;
        int w=0;
        for(int i=10;num%i!=0;num=num/10)
        {
            int a=num%10;
            System.out.print(a);
            int b=count++;
            System.out.println(" Place Value "+(b+1));
            int d= (int)Math.pow(10,(a-1));
            int x=(count*d);
            w=w+x;
        }
        System.out.println("Your inverse of the given number is: "+w);
    }
}
