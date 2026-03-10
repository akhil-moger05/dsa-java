import java.util.*;
public class Solutiona {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num;

        System.out.println("Enter your integer: ");
        num=sc.nextInt();

        if ( isEven (num)){
            System.out.println("this is even number");
        }else{
        System.out.println("this is odd number");
    }

}
public static boolean isEven(int number){
    if (number%2==0){
        return true;
    }else
        {
        return false;
    }
}
}

