package com.a;

public class SecondLargest {
	public static int second(int[] a, int total) {
		int temp=0;
		for (int i = 0; i < total; i++) {
			for (int j = i+1; j < total; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//return a[total-1];
		return a[total-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,5,5,4,5,5,5};
		int b[]= {56, 46, 99, 77, 33, 22, 55};
		System.out.println(second(a,8));
		System.out.println(second(b,7));

	}

}
