package com.array;

public class QuickSort {

	int a[]={3, 5, 7, 2, 3, 4 ,9, 11, 12, 34, 5, 7, 8};
	
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	int partition(int lower, int upper)
	{
		if(lower<upper)
		{
			int pivot=a[upper];
			int t=0;
			for(int i=0; i<upper; i++){
				if(a[i]<=pivot){
				swap(i, t);
				t++;
				}
			}
			swap(t,upper);
			return t;
		}
		return -1;
	}
	void swap(int x, int y){
	int t=a[x];
	a[x]=a[y];
	a[y]=t;
	}
	
	void print(){
		for(int  i=0; i<a.length; i++){
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}
	
	void quickSort(int lower, int upper){
		if(lower<upper){
		int p=partition(lower, upper);
		quickSort(lower,p-1);
		quickSort(p+1, upper);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort sort=new QuickSort();
		sort.quickSort(0, sort.a.length-1);
		sort.print();
	}

}
