package com.array;

import java.sql.ResultSet;


public class FourElementsAmoungSumToX {
	public int a[];
	public FourElementsAmoungSumToX() {
		a=new int[10];
		for(int i=0; i<10; i++)
			a[i]=(int)(Math.random()*100);
		print();
	}
	MergeSort.ReseltSet[] reseltSet;
	void fourElementsAmoungSumToX(){
		int resultCount=0;
		reseltSet=new MergeSort.ReseltSet[(int)a.length*(a.length-1)/2];
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<a.length; j++)
			{
				reseltSet[resultCount]=(new MergeSort()).new ReseltSet();
				reseltSet[resultCount].sum=a[i]+a[j];
				reseltSet[resultCount].first=i;
				reseltSet[resultCount].second=j;
				resultCount++;
			}
		MergeSort sort=new MergeSort();
		sort.setSet(reseltSet);		
		sort.mergeSort(0,reseltSet.length-1);
		sort.print();
	
		
	}
	void print(){
		for(int i=0; i<a.length; i++)System.out.print(" "+a[i]);
		System.out.println();
	}
	

	public static void main(String[] args) {
		FourElementsAmoungSumToX x=new FourElementsAmoungSumToX();
		x.fourElementsAmoungSumToX();
	}

} 
