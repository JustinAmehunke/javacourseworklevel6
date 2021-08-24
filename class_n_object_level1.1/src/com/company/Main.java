package com.company;

import java.util.Scanner;

class Area{
    int length;
    int breadth;
    public Area(int a, int b){
        length = a;
        breadth = b;
    }

public int setDim(){
        int result = length * breadth;
        return  result;
}
public void getArea(){
    System.out.println("Area= " + setDim());
}
}
class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the length of Rectangle");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Enter the breadth of Rectangle");
        b = input.nextInt();
        Area area = new Area(a,b);
        area.getArea();
    }
}
