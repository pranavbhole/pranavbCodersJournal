package com.array;
/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */

public class UniqueRows {

	int a[][]=
  { {0, 1, 0, 0, 1},
    {1, 0, 1, 1, 0},
    {0, 1, 0, 0, 1},
    {1, 1, 1, 0, 0} };
	
	Node root=new Node();
		
        void printUniqueRows()
	{
		for(int i=0; i<a.length;i++){
			Result r=new Result();
			isUnique(i,0,root, r);

			if(r.flag==true){
				for(int k=0; k<a[0].length;k++)
					System.out.print(a[i][k]);
			System.out.println();	
			}
		}
	}
	//1001
	//1011
	void isUnique(int row, int ptr, Node root, Result r){
		if(ptr<a[0].length)
		{
			if(root==null){
				root=new Node();
			}
				
				if(a[row][ptr]==1 && root.right==null){
					r.flag=true;
					root.right=new Node();
					root.right.value=1;
				}
				if(a[row][ptr]==0 && root.left==null)
				{
					r.flag=true;
					root.left=new Node();
					root.left.value=0;
				}
			
				if(ptr+1<a[0].length){
					if(a[row][ptr+1]==0)
						isUnique(row, ptr+1, root.left, r);
				
					if(a[row][ptr+1]==1)
						isUnique(row, ptr+1, root.right, r);
				}
		}		
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
UniqueRows rows=new UniqueRows();
rows.printUniqueRows();
}
}

class Node {
public int value=-1;
public Node left=null;
public Node right=null;
}

class Result{
	boolean flag=false;
}