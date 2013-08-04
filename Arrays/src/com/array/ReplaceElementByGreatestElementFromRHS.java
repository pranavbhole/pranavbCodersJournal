package com.array;

public class ReplaceElementByGreatestElementFromRHS {
int a[];
	public ReplaceElementByGreatestElementFromRHS() {
		a=new int[10];
		for(int i=0; i<10; i++)
			a[i]=(int)(Math.random()*100);
		print();
	}
	void replaceElementByNextGreatest(){
		int greatestTillNow;
		greatestTillNow=a[a.length-1];
		a[a.length-1]=-1;
		for(int i=a.length-2; i>=0; i--)
		{
		int temp=a[i];
		a[i]=greatestTillNow;
		if(temp>greatestTillNow)greatestTillNow=temp;
		}
	print();
	}
	
	 void print() {
			for(int i=0; i<a.length; i++)System.out.print(a[i]+" , ");
			System.out.println();		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceElementByGreatestElementFromRHS replace=new ReplaceElementByGreatestElementFromRHS();
		replace.replaceElementByNextGreatest();

	}

}
