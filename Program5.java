import java.util.Scanner;
public class Program5 {
    public static void main(String ar[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number");
        int num=s1.nextInt();
        if(num==0)
        System.out.println("1");
        else{
        int count=0;
        while(num>0){
        num=num/10;
        count=count+1;
        }
        System.out.println(count);
       }
    }    
}
