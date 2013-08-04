package com.array;





public class MergeSort {
	
	ReseltSet set[];
	
	public ReseltSet[] getSet() {
		return set;
	}
	public void setSet(ReseltSet[] reseltSet) {
		this.set = reseltSet;
	}
	void mergeSort(int lower, int upper){
		if(lower<upper){
			int mid=(upper+lower)/2;
			mergeSort(lower,mid);
			mergeSort(mid+1,upper);
			ReseltSet temp[]=new ReseltSet[upper-lower+1];
			int k=0;
			int i=lower; int j=mid+1;
			do{
				if(set[i].sum>=set[j].sum)
				{
					temp[k]=set[j]; j++;
					
				}
				else{
					temp[k]=set[i]; i++;
				}
				k++;
			}while(i<=mid && j<=upper);
			
			for(int n=i; n<=mid; n++)temp[k++]=set[n];
			System.out.println();for(iSystem.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();nt n=j; n<=upper; n++)temp[k++]=set[n];
			
			int count=0;
			for(int t=lower; t<=upper; t++){
				set[t]=temp[count++];
			}
		}
	}
	void print(){
		for(int i=0; i<set.length; i++){
			System.out.print(" "+set[i].sum);
		}
		System.out.println();System.out.println();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public class ReseltSet{
	public int sum;
	public int first, second;
}
}
