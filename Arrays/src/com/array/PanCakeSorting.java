package com.array;
/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
public class PanCakeSorting {
	int a[]={4, 5, 8, 9, 10, 3, 6, 1, 2, 1};
	void sort(){
	for(int i=0; i<a.length; i++){
		int index=getMinIndex(a.length-1-i);
		flip(index);
		flip(a.length-1-i);	
	}
	}
	void flip(int i){
		int count=0;
		int temp=i;
		while(count<=i/2){
			swap(count, temp);
			count++; temp--; 
		}
	}
	
	void swap(int i, int t){
		int c=a[i];
		a[i]=a[t]; a[t]=c;
	}
	int getMinIndex(int upper){
	int m=Integer.MAX_VALUE, index=0;
	for(int i=0; i<=upper; i++){
		if(a[i]<m){
			m=a[i];
			index=i;
		}
	}
	return index;
	}
	
	void print(){
		for(int i=0; i<a.length; i++){
			System.out.print("  "+a[i]);
		}
		System.out.println();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	PanCakeSorting cakeSorting=new PanCakeSorting();
	cakeSorting.print();
	cakeSorting.sort();
	cakeSorting.print();
		// TODO Auto-generated method stub
	}

}
