package com.company;

import java.util.*;
class Complex{
    int real;
    int imag;
    public Complex(int r, int i){
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }

}

class Ans{
    public static void main(String[] args){
        int ir,ii, jr, ji;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number");
        ir = s.nextInt();
        System.out.println("Enter Second Number");
        ii = s.nextInt();
        Complex c = new Complex(ir,ii);
        System.out.println("Enter Another First Number");
        jr = s.nextInt();
        System.out.println("Enter Another Second Number");
        ji = s.nextInt();
        Complex d = new Complex(jr,ji);

        Complex e = Complex.add(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.product(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}