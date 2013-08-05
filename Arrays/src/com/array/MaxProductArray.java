/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
package com.array;

public class MaxProductArray {

	public int a[]={6, 2, -1, 0, 3 , 9, -3, -5, 0, 10, 12, -3, 4};
	public int maxProduct=Integer.MIN_VALUE;
	public int maxStartIndex;
	public int maxEndIndex;
	
	void maxProductArray(){
		int maxPositiveProduct=1;
		int startIndex=0;
		int endIndex=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>0){
				maxPositiveProduct*=a[i];
				endIndex=i;
			}else 
			if(a[i]==0){
				maxPositiveProduct=1;
				startIndex=i+1;
				endIndex=i+1;
			}else
				if(a[i]<0){
					int temp=maxPositiveProduct;
					maxPositiveProduct*=a[i];
				 if(maxPositiveProduct>temp){
					 endIndex=i;
				 }
				}
		if(maxPositiveProduct>maxProduct){
			maxProduct=maxPositiveProduct;
			maxStartIndex=startIndex;
			maxEndIndex=endIndex;
		}
		}
		System.out.println("Max Product="+maxProduct);
		System.out.println("Max StartIndex="+maxStartIndex);
		System.out.println("Max EndIndex="+maxEndIndex);
	}
	public static void main(String[] args) {
 MaxProductArray array=new MaxProductArray();
 array.maxProductArray();
	}
}
