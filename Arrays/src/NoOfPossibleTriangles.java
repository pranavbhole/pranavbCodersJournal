
public class NoOfPossibleTriangles {

	int sorted[]={3, 4, 6, 7, 9, 10, 13};
	
	void printPossibleTrianglesInArray(){
		int first=0;
		while(first<sorted.length-2)
		{
			for(int second=first+1; second<sorted.length-1; second++){
				int third=modifiedBinary(first, second);
				
			}
		}
	}
	
	int modifiedBinary(int first, int second){
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
