import java.util.Scanner;

public class Program10 {
    public static void main(String ar[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number");
        int num=s1.nextInt();
        System.out.println("prime factorization of number is");
        for(int i=2;i<=num;i++){
        if(num%i==0){
            num=num/i;
            System.out.print(i+"x");
        }
        }
    }
}
