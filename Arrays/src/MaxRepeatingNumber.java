
public class MaxRepeatingNumber {
	int arr[] = {1, 2, 2, 2, 2, 2, 0, 0, 3, 8, 0, 0, 0, 3};

public int maxRepeating(){
int current=arr[0];int count=1;
for(int i=1; i<arr.length;i++){
	if(current==arr[i]){
		count++;
	}
	else{ if(count==0){current=arr[i]; count++;}
	else count--;
	}	
}
return current;
}
     /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MaxRepeatingNumber maxRepeatingNumber=new MaxRepeatingNumber();
   System.out.println(maxRepeatingNumber.maxRepeating());
	}

}
