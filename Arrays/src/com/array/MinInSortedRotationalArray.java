package com.array;
/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
public class MinInSortedRotationalArray {
	int a[]={3,4,5,5,5,6,7,1,1,1,2,2};
	int minInSortedRotationalArray(int lower, int upper){
	int mid=(lower+upper)/2;
	if(upper-lower==1 || upper-lower==-1){
		if(a[upper]-a[lower]!=1 || a[upper]-a[lower]!=-1){
		return a[lower]<a[upper]?a[lower]:a[upper];	
		}
		return 0;
	}else
	if(Math.abs(a[lower]-a[mid])<=(mid-lower) && a[lower]<=a[mid]){
	return minInSortedRotationalArray(mid+1, upper);	
	}
	else
	return minInSortedRotationalArray(lower,mid);	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MinInSortedRotationalArray array=new MinInSortedRotationalArray();
     System.out.println("="+array.minInSortedRotationalArray(0,array.a.length-1));     
	}

}
