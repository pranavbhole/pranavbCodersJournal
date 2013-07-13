/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */

public class VisitingAllPetrolPumps {

	int fuel[]={7 , 4, 4, 7, 8, 9};
	int dist[]={10, 4, 5, 5, 9, 9};

	int getStartingPlaceON2(){
boolean flag=true;
int start=-1;
		for(int i=0; i<fuel.length && flag; i++)
		{	 
		 int currentFuel=0;
		 int end=i;
			 while(currentFuel>=0)
			 {
				 currentFuel=currentFuel+fuel[end]-dist[end];
				 end=(end+1)%fuel.length;
				 if(end==i){
					 flag=false;
					 start=i;
					 break;
					 }
			 }
		}
		return start;
	}
	
	int getStartingPlaceEfficient(){
    int start=0;
    int end=1;
    int currentFuel=fuel[start]-dist[start];
    while(start!=end || currentFuel<0)
    {
        while(start!=end && currentFuel<0)
        {
        	currentFuel=currentFuel-(fuel[start]-dist[start]);
        	start=(start+1)%fuel.length;
        	if(start==0)return -1;
        }
      	currentFuel=currentFuel+(fuel[end]-dist[end]);
      	end=(end+1)%fuel.length;
    }
		return start;
	}
	
	public static void main(String args[]){
	VisitingAllPetrolPumps pumps=new VisitingAllPetrolPumps();
	System.out.println(pumps.getStartingPlaceON2());
	;
	}
}
