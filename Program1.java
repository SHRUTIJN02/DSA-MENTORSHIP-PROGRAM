import java.util.*;

 public class Program1{
    /**
     * @param ar
     */
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(i==0||i==(n-1)||j==(n-1-i)){
                    System.out.print("*");
            }
                else{
                    System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
 }