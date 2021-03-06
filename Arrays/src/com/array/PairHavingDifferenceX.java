/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */

package com.array;

public class PairHavingDifferenceX {
public int a[]={6 , 10 , 17 , 18 , 20 , 28 , 31 , 60 , 65 , 94};
public PairHavingDifferenceX() {
//	a=new int[10];
//	for(int i=0; i<10; i++)
//		a[i]=(int)(Math.random()*100);
	QuickSort quickSort=new QuickSort();
	quickSort.setA(a);
	quickSort.quickSort(0,a.length-1);
	print();
	// TODO Auto-generated constructor stub
}
void print(){
	for(int i=0; i<a.length; i++)System.out.print(a[i]+" , ");
	System.out.println("");
}

void printPairHavingDifferenceX(int x){
	int startIndex;
	startIndex=BinarySearchForUpperBound(x,0, a.length-1);
	System.out.println("StartIndex="+startIndex);	
	
	do{
		int second=a[startIndex]-x;
		int secondIndex=BinarySearch(second,0,a.length-1);
		if(secondIndex==-1){
			startIndex++;
			System.out.println("secondIndex="+secondIndex+", Element "+second+" not found, thus looping up for next difference!");
		}
		else 
			if(a[secondIndex]==second){
			System.out.println(" ("+a[startIndex]+", "+a[secondIndex]+")");
			break;
			}		
		
	}
	while(startIndex<a.length);
}
int BinarySearch(int x, int lower, int upper){
if(upper>lower){
	int mid=(upper+lower)/2;
	if(a[mid]==x)return mid;
	else
		if(a[mid]<x) return BinarySearch(x,mid+1, upper);
		else 
			if(a[mid]>x) return BinarySearch(x, lower, mid-1);
} 
return -1;
}


int BinarySearchForUpperBound(int x, int lower, int upper){
	if(upper>lower){
		int mid=(upper+lower+1)/2;
		if(a[mid]<=x && a[mid+1]>=x)return mid+1;
		else
			if(a[mid]<x) return BinarySearchForUpperBound(x,mid, upper);
			else 
				if(a[mid]>x)return BinarySearchForUpperBound(x, lower, mid-1);
	} 
	else if(upper==lower)
		if(x>=a[lower])return lower;
	return -1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairHavingDifferenceX differenceX=new PairHavingDifferenceX();
		differenceX.printPairHavingDifferenceX(21);

	}

}
