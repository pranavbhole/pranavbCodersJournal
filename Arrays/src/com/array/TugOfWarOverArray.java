package com.array;
/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */

public class TugOfWarOverArray {
	
	int a[]={3, 4, 5, -3, 100, 1, 89, 54, 23, 20};
  public  int halfsum=0;
  public  int minDiff=99999;
  public  String part1;
  int noOfcalls=0;
	void tugOver(int cur_pos,int sum, int no_of_element, String str){
		System.out.println("("+cur_pos+", "+sum+", "+no_of_element+", ["+str+"]); Call no="+noOfcalls++);
		if(cur_pos==a.length)return;
		if(no_of_element> a.length/2+1)return;
		 if(no_of_element==a.length/2+1 || no_of_element==a.length/2)
		 {
			 if(minDiff>Math.abs(halfsum-sum)){minDiff=Math.abs(halfsum-sum); part1=str;}
			 return;
		 }
		 if(minDiff>Math.abs(halfsum-sum))
		tugOver(cur_pos+1, sum, no_of_element, str);
		 
		tugOver(cur_pos+1, sum+a[cur_pos], no_of_element+1, str+", "+a[cur_pos]);
		 
	}
	void setHalfsum(){
		for(int i=0; i<a.length;i++)halfsum+=a[i];
		halfsum=halfsum/2;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TugOfWarOverArray array=new TugOfWarOverArray();
array.setHalfsum();
System.out.println("Half Sum="+array.halfsum);
array.tugOver(0,0,0,"");
System.out.println("mindiff="+array.minDiff);
System.out.println("part1="+array.part1);
	}

}
