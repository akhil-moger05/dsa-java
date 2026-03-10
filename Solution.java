import java.util.*;
public class Solution {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter your first number: ");
    double x=sc.nextDouble();
    System.out.println("enter your second number: ");
    double y = sc.nextDouble();
    System.out.println("enter your third number: ");
    double z = sc.nextDouble();

    System.out.println("average of three number: "+average(x,y,z)+"\n");

        }
        public static double average(double x,double y,double z){
            return (x+y+z)/3;
        }
    } 
    

