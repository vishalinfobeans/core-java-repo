package com;

public class BubbleShort {
	public static void main(String[] args) {
		int []ar = {1,324,5,67,4,23,56,4};   // 324,5,67,4,23,56,4,1
		BubbleShort b1 = new BubbleShort();
		b1.bubbleSort(ar);
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}
	private void bubbleSort(int[] arr) {
		int num = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=1; j<arr.length;j++){
				if(arr[j-1]>arr[j]){
					num = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = num;
				}
				//break;
			}
		}
	}
}
