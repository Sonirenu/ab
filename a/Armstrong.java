package com.a;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=151;
		int rem,rev,sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum+=(rem*rem*rem);
			num=num/10;
		}
		//System.out.println(sum);
		if(temp==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not a armstrong");
		}
	}

}
