package com.company;

import java.io.*;
import java.util.*;
class CrArea
{
    public static void main(String args[])
    {
        float a,b,c,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextFloat();
        System.out.println("Enter the value of b");
        b=sc.nextFloat();
        System.out.println("Enter the value of c");
        c=sc.nextFloat();
        System.out.println("The average of three no. is :"+average(a,b,c));
    }
    public static float average(float a, float b, float c)
    {
        return (a+b+c)/3;
    }
}
