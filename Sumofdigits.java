import java.util.*;
public class Sumofdigits {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input your intger: ");
        int digits=sc.nextInt();
        System.out.println("the sum is "+sumDigits(digits));
    }
    public static int sumDigits(int n){
        int Sumofdigits=0;
        while(n>0){
            int lastdigits=n%10;
            Sumofdigits+=lastdigits;
            n/=10;


        }
        return Sumofdigits;
         

        }
    }

