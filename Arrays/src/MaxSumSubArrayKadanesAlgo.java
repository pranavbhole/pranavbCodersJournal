/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
public class MaxSumSubArrayKadanesAlgo {
public int a[]={1,-3,4,5, 1 ,6, -1, 2,7, 3,  8, 9,-3, 6, -7};
public int b[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
void maxSumSubArray(int lower,int upper){
int maxSum=Integer.MIN_VALUE;
int maxStartIndex=0;
int maxEndIndex=0;

int startIndex=0;
int endIndex=0;
int sum=0;
	for(int i=lower; i<upper;i++){
		sum=sum+a[i];
		if(sum>sum-a[i]){
			endIndex=i;
			if(sum>maxSum){
				maxSum=sum;
				maxStartIndex=startIndex;
				maxEndIndex=endIndex;			
			}
		}
		else if(a[i]+sum<0){
			sum=0;
			startIndex=i+1;
		}
	}
System.out.println("maxStartIndex="+maxStartIndex);
System.out.println("maxEndIndex="+maxEndIndex);
System.out.println("maxSum="+maxSum);
}
 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSumSubArrayKadanesAlgo algo=new MaxSumSubArrayKadanesAlgo();
		algo.maxSumSubArray(0, algo.a.length);
	}
}
