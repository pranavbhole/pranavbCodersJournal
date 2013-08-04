package com.array;

import java.util.Stack;

public class ReplaceElementByGreatestElementFromRHS {
int a[];
Stack<String> stackOfLeaders=new Stack<String>();
	public ReplaceElementByGreatestElementFromRHS() {
		a=new int[10];
		for(int i=0; i<10; i++)
			a[i]=(int)(Math.random()*100);
		print();
	}
	void replaceElementByNextGreatest(){
		int greatestTillNow;
		greatestTillNow=a[a.length-1];
		stackOfLeaders.push(""+greatestTillNow);
		a[a.length-1]=-1;
		for(int i=a.length-2; i>=0; i--)
		{
		int temp=a[i];
		a[i]=greatestTillNow;
		if(temp>greatestTillNow){greatestTillNow=temp;
		stackOfLeaders.push(""+greatestTillNow);	
		}
		}
	print();
	}
	
	 void print() {
			for(int i=0; i<a.length; i++)System.out.print(a[i]+" , ");
			System.out.println("");
			if(!stackOfLeaders.isEmpty())System.out.println("Leaders :");
			while(!stackOfLeaders.isEmpty()){
				System.out.print(" "+stackOfLeaders.pop());
			}
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
