package com.array;
/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */

/* In Place transpose: As I am writing this program in java,
 * I am assuming that matrix is stored in the C/C++ Style 
 * in the continuous manner. 
 * Output is also stored in the C/C++ style.
 */

public class InPlaceTranspose {

	int a[]={1, 2, 3, 35, 
			4, 5, 6, 65,  
			7, 8, 9, 95};
	
    int rows=3;
    int columns=4;
    int t[];
    
    public void fillTranspose(){
    	t=new int[a.length];
    	int count=0;
    	int i=0; int jump;
    	while(i<columns)
    	{
    		jump=i;
    		do
    		{
    			t[count++]=a[jump];
    			jump=(jump+columns)%a.length;    			
    		}while(jump!=i);
    	i++;
    	}
    	
    	for(int j=0; j<t.length; j++){
    		System.out.print(" "+t[j]);
    		if((j+1)%rows==0)System.out.println();
    	}
    }
	
	public static void main(String[] args) {
		InPlaceTranspose transpose=new InPlaceTranspose();
		transpose.fillTranspose();
	}

}
