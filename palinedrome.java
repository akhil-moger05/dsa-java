import java.util.*;
public class palinedrome {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int palinedrome=sc.nextInt();

        if(isPalinedrome(palinedrome)){
            System.out.println("This is palinedrome");
        }else{
                System.out.println("this is not palinedromme");
            }

        }
        public static boolean isPalinedrome(int number){
            int palinedrome=number;
            int reverse=0;

            while(palinedrome!=0){
                int remainder=palinedrome%10;
                reverse=reverse*10+remainder;
                palinedrome=palinedrome/10;

            }
            if(number==reverse){
                return true;
            }
            return false;
        }



    }
    

