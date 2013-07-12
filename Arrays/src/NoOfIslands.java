/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */

public class NoOfIslands {
int a[][]={{1, 1, 0, 0, 0},
{0, 1, 0, 0, 1},
{1, 0, 0, 1, 1},
{0, 0, 0, 0, 0},
{1, 0, 1, 0, 1}};

int noOfIsLands(){
	int count=0;
	for(int i=0; i<5; i++)
		for(int j=0; j<5; j++){
			if(a[i][j]==1){count++;
			markNeighbors(i ,j);}
		}
	return count;
}

int call=0;
void markNeighbors(int i ,int j){
	System.out.println(++call);
	if(i>=0 && i<5 && j>=0 && j<5 ){
		if(a[i][j]==1){a[i][j]=0;
		
		if(a[i][j+1]==1)markNeighbors(i, j+1);
		if(a[i+1][j]==1)markNeighbors(i+1, j);
		if(a[i+1][j+1]==1)markNeighbors(i+1, j+1);
		if(j>0 && a[i][j-1]==1)
		markNeighbors(i, j-1);
		if(i>0  && a[i-1][j]==1)
		markNeighbors(i-1, j);
		if(i>0 && j>0  && a[i-1][j-1]==1)
		markNeighbors(i-1, j-1);
		if(i>0  && a[i-1][j+1]==1)
		markNeighbors(i-1, j+1);
		if(j>0  && a[i+1][j-1]==1)
		markNeighbors(i+1, j-1);
	}
	}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOfIslands islands=new NoOfIslands();
		System.out.println(islands.noOfIsLands());
	}

}
