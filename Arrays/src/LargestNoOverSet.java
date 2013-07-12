/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class LargestNoOverSet {
int a[]={451, 421, 45, 5, 86, 72, 81, 83, 84 , 21, 0, 10, 4};
	
	void largestNoOverSet(){
	 Stack <Integer> stack[] = new Stack[10];
		for(int i=0; i<10; i++){
			stack[i]=new Stack();
		}
		int sno;
		for(int i=0; i<a.length; i++)
		{
			sno=getStackNO(a[i]);
			if(stack[sno].isEmpty()){
					stack[sno].push(new Integer(a[i]));
			}
			else 
			{
				if(a[i]/10==0)stack[sno].push(new Integer(a[i]));
				else
				{
				Stack<Integer> temp=new Stack();
				
				while(!stack[sno].isEmpty() && stack[sno].peek().intValue()/10==0 )temp.push(stack[sno].pop());
				
				if(!stack[sno].isEmpty())
				{
					int top=stack[sno].peek().intValue();
					
							int item=a[i];							
							
							while(!stack[sno].isEmpty()){
								top=stack[sno].peek().intValue();
								if(top>item){
									temp.push(stack[sno].pop());
								}
		 						else break;
							}
				}
							stack[sno].push(new Integer(a[i]));
							while(!temp.isEmpty()){
								stack[sno].push(temp.pop());
							}
						
				}
			}
		}
		//Sorted Stacks
		for(int i=9; i>=0;i--)
		{
			while(!stack[i].isEmpty())
			{
				System.out.print(" "+stack[i].pop().intValue());
			}
		}
		
	}
	int getStackNO(int num){
		int mod=num%10;
		while(num>0){
		mod=num%10;
		if(num%10==0)mod=1;
			num/=10;
		}
		return mod;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNoOverSet set=new LargestNoOverSet();
		set.largestNoOverSet();

	}

}
