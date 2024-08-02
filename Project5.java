import java .util.*;
public class Project5 {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        float x;
        System.out.println("Enter  a number:");
        x=input.nextFloat();
        System.out.format("%f\t%f\t%f",x,Math.pow(x,2),Math.pow(x,3));


    }
}
