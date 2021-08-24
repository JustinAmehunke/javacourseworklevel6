package com.company;

class student
{
    String address;
    int roll_no;
    int phone;
    String name;
}
class Ans
{
    public static void main(String[] args)
    {
        student object1=new student();
        student object2=new student();

        object1.name="john";
        object1.roll_no=001;
        object1.address="Tesano";
        object1.phone=0265467;

        object2.name="sam";
        object2.roll_no=002;
        object2.address="Lapaz";
        object2.phone=0547212;



        System.out.println("Student1: Roll no: "+object1.roll_no+"\nName: "+object1.name+"\nPhone Number: "+object1.phone+"\nAddress: "+object1.address);

        System.out.println("Student2: Roll no: "+object2.roll_no+"\nName: "+object2.name+"\nPhone Number: "+object2.phone+"\nAddress: "+object2.address);

    }

}
