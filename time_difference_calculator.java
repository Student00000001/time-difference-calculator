import java.util.*;

public class time_difference_calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double ans;
        System.out.println("This is a program for calculating the time difference between two places on a map\nInsert the longitide value of the place from which the time will be calculated");
        double a = sc.nextDouble();
        System.out.println("State wheather the given latidude is north or south by typing the letter in capitals as \'E\', \'W\'");
        char aa = sc.next().charAt(0);
        System.out.println("Now enter the longitude of the second location on the map");
        double b = sc.nextDouble();
        System.out.println("State wheather the given latidude is north or south by typing the letter in capitals as \'E\', \'W\'");
        char bb = sc.next().charAt(0);
        System.out.println("Calculating time difference\nFrom\t"+a+" "+aa+"\nto\t"+b+" "+bb);

        if (aa == bb)
        {
            ans = (b-a)*3.98908;
        }
        else
        {
            ans = (a+b)*3.98908;
        }
        System.out.println("The time difference is "+ans+" minutes");

        if (ans > 60)
        {
            int hours = (int) (ans / 60);
            double minutes = ans % 60;
            System.out.println("OR\tThe time difference is "+hours+" hours and "+minutes+" minutes");
        }
    }
}