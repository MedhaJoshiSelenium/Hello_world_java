package com.clone;

public class Complex implements Cloneable{
int real;
int imag;
@Override
public String toString() {
	return "Complex [real=" + real + ", imag=" + imag + "]";
}
public Complex(int real, int imag) {
	super();
	this.real = real;
	this.imag = imag;
}

public Object clone()
{
	Complex temp=new Complex(this.real,this.imag);
	return temp;
}
public static void main(String[] args) {
	Complex c1=new Complex(10,20);
	Complex c2=(Complex) c1.clone();
	System.out.println(c1==c2);
}
}


/*
Object clone()
int hashcode()
boolean equals()
void wait()
void notify()
void notifyall()
Class getClass()
void finalize()
String toString()


*/