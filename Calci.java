package com.calci;

public class Calci {
int a;
int b;
int result;

public int add(int a,int b)
{
	this.a = a;
	this.b = b;
	int result = a + b;
	return result;
}

public int sub(int a,int b)
{
	this.a = a;
	this.b = b;
	int result = a - b;
	return result;
}

public int div(int a,int b)
{
	this.a = a;
	this.b = b;
	int result = a / b;
	return result;
}



	public int getResult() {
	return result;
}

public void setResult(int result) {
	this.result = result;
}

	public static void main(String[] args) {
//		Calci calci = new Calci();
//		System.out.println(calci.add(10, 20));
//		System.out.println(calci.sub(10, 20));
		
//		int[2][5] twoDimArray = { {1}, {4}, {7} };
//		System.out.println(twoDimArray );
	//	int[][] sampleArray = new int[][2];

	}

}
