import java.util.*;
public class Program8{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        System.out.println("Enter number of times you want to rotate:");
        int q=z.nextInt();
        System.out.println("Enter the number to be rotated:");
        int n=z.nextInt();
        int a=(int)Math.pow(10,q);
        int w=n/a;
        int r=n%a;
        int c=0;
        for(int i=10;n%i!=0;n=n/i)
        {
            c++;
        }
        int x=(int)Math.pow(10,(c-q));
        int h=r*x;
        System.out.println("The number rotated " +q+ " times is: "+(h+w));
    }
}