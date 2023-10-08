import java.util.*;

public class Program3 {
    public static void main(String ar[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s1.nextInt();
        int flag=0;
        if(n==1){
            System.out.println("mumber is neither prime nor composite");
            
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                    flag=1;
                    break;
            }
            
        }
            if(flag==0){
                        System.out.println("number is prime"+n);
            }
             else
            System.out.println("number is not prime"+n);
                   
    }
}
