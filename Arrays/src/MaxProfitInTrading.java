
public class MaxProfitInTrading {
int sharePrices[]={130 , 40, 100, 200, 400, 91, 123, 341, 34, 900};

public void printMaxBuySellDays(){
int i=0; int count=0;
int buy[], sell[];
buy=new int[sharePrices.length]; 
sell=new int[sharePrices.length];
while(i<(sharePrices.length-1)){
	while((i<(sharePrices.length-1))&& sharePrices[i+1]<=sharePrices[i])
		i++;
	buy[count]=i++;
	while((i<(sharePrices.length-1))&& sharePrices[i+1]>=sharePrices[i])
		i++;
	
	sell[count]=i++;
	
	count++;
}
for(int j=0; j<count; j++){
	System.out.println(" Buy="+buy[j]+" , Sell="+sell[j]);
}

}
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MaxProfitInTrading inTrading=new MaxProfitInTrading();
     inTrading.printMaxBuySellDays();
	}

}
