package com.array;
/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
public class Partition {

	public int a[]={10,-2,-3,3,2,4,4,6,2,4,8};

	int partition(int pivot){
	int t=-1;
	for(int i=0; i<a.length; i++){
		if(a[i]<pivot){
			t++;
			swap(i,t);
		}
	}
	return t;
}
	
	int partitionOnRange(int pivot, int lower, int upper){
	int t=lower-1; int v=lower-1;
	for(int i=lower; i<upper; i++){
		if(a[i]<pivot){
			t++;v++;
			swap(t,v);
			swap(i,t);
		}else if(a[i]==pivot){
			v++;
			swap(v, i);
		}	
	}
	System.out.println("v="+v);
	return t;
}
	
void swap(int i, int t){
	int c=a[i];
	a[i]=a[t]; a[t]=c;
}
	
void print(){
	for(int i=0; i<a.length; i++){
		System.out.print("  "+a[i]);
	}
	System.out.println();
}

void arrangeAlternate(int t){
for(int i=1; i<a.length && (t+1)<a.length;i=i+2){
	t++;
	swap(i,t);	
}	
}
	/**
	 * @param args
	 */
int selection(int rank, int lower,int upper){
System.out.println("Lower="+lower+", upper="+upper);	
int tmp=partitionOnRange(a[rank], lower, upper)+1;
if(tmp==rank)return a[tmp];  
if(tmp>rank){
	return selection(rank, lower, tmp);
}else{
	return selection(rank, tmp, upper);
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partition p=new Partition();
		p.print();
		//int t=p.partitionOnRange(2,0,p.a.length);
		//System.out.println(" t="+t);
		//p.print();
		//p.arrangeAlternate(t);
		
		System.out.println(" 9 th ranked="+p.selection(4,0,p.a.length));
		p.print();
	}

}
