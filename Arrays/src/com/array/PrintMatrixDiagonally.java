package com.array;
/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
import java.util.Stack;

public class PrintMatrixDiagonally {

public 	int m[][]={{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{12, 22,23, 24, 25}};
	
	 public void print(){
		int bound=m.length-1;
	Stack<Integer> s[]=new Stack[bound*2+1];
	for(int i=0; i<s.length;i++){
		s[i]=new Stack<Integer>();
	}
	
	for(int i=0; i<=bound;i++)
		for(int j=0; j<=bound;j++){
			s[i+j].push(new Integer(m[i][j]));
		}
	for(int i=0; i<s.length;i++){
		while(!s[i].isEmpty())
			System.out.print(s[i].pop().intValue()+" ,");
		System.out.println();
	}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrintMatrixDiagonally diagonally=new PrintMatrixDiagonally();
		 diagonally.print();
	}
}
