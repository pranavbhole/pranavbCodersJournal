package com.array;


public class FourElementsAmoungSumToX {
	public int a[];
	public FourElementsAmoungSumToX() {
		a=new int[20];
		for(int i=0; i<20; i++)
			a[i]=(int)Math.random()*100;
	}
	MergeSort.ReseltSet[] reseltSet;
	void fourElementsAmoungSumToX(){
		int resultCount=0;
		reseltSet=new MergeSort.ReseltSet[(int)a.length*(a.length-1)/2];
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<a.length; j++)
			{
				reseltSet[resultCount]=new MergeSort.ReseltSet();
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
	

	public static void main(String[] args) {
		FourElementsAmoungSumToX x=new FourElementsAmoungSumToX();
		x.fourElementsAmoungSumToX();
	}

} 
