
public class IntervalOverlapping {

	int start[]={1, 3, 4, 6, 9, 10};
	int end[]=  {2, 5, 5, 8, 13, 15};

	void printIntervals(){
		int i=1;
		int si=start[0];
		int ei=end[0];
		while(i<start.length){
			if(ei<start[i]){
				System.out.println("{"+si+", "+ei+"}");
				si=start[i];
				ei=end[i];
			}else
				if(ei>=start[i]){
				ei=end[i];	
				}
			i++;
			if(i==start.length){
				System.out.println("{"+si+", "+ei+"}");
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    IntervalOverlapping overlapping=new IntervalOverlapping();
    overlapping.printIntervals();
	}

}
