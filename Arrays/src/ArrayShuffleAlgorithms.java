/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
import java.util.Random;
public class ArrayShuffleAlgorithms {

	public char a[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
String fisherYates()
{
	char shuffled[];
if(this.a.length>1){
	boolean strikeOut[]=new boolean[this.a.length];
	shuffled=new char[a.length];
	int shuffledCount=0;
	for(int i=0; i<strikeOut.length; i++)strikeOut[i]=false;
	Random r=new Random();
	for(int i=a.length; i>0; i--){
		int k=r.nextInt(i);
		if(k>0)k=k-1;
		int tmpCount=-1;
			for(int j=0; j<strikeOut.length; j++)
			{
				if(strikeOut[j]==false)tmpCount++;
				
				if(tmpCount==k){
					System.out.println("Stricking out "+j);
				strikeOut[j]=true; 
				shuffled[shuffledCount++]=a[j];
				break;
				}
			}
	}
	return new String(shuffled);
}
if(a.length==1)return new String(a);
return null;
}

String simpleShuffle()
{
	if(this.a.length>1){
		Random r=new Random();
		for(int i=a.length-1;i>0;i--){
		int k=r.nextInt(i);
		swap(k, i);
		}
		return new String(a);
	}
	if(this.a.length==1)return new String(a);
	return null;
}
 void swap(int i, int j){
	 char t=a[i];
	 a[i]=a[j];
	 a[j]=t;
 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayShuffleAlgorithms algorithms=new ArrayShuffleAlgorithms();
		System.out.println(algorithms.simpleShuffle());
	}

}
