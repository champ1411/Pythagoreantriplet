package com.company;
import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no of triplet :");
        int n=in.nextInt();
        System.out.println("Enter "+n+" triplets ");
        for(int i=1;i<=n;i++) {
            int a = in.nextInt();
            int b =in.nextInt();
            int c= in.nextInt();
            System.out.println(IsPythagorean(a,b,c));
        }
    }
    static boolean IsPythagorean(int a,int b,int c) {
        if (Max(a, b, c) == a) {
            return ((a*a)==(b*b)+(c*c));
        }
        else if(Max(a,b,c)==b)
            return ((b*b)==(a*a)+(c*c));
        else
            return ((c * c) == (b * b) + (a * a));
    }
    static int Max(int a,int b,int c ){
        return (Math.max(a,Math.max(b,c)));

    }
}
