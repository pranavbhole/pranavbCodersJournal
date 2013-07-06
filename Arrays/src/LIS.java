/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
public class LIS {
public	int a[]={6, 7, 8, 1, 2, 3, 9, 10};
public	int  max=0;
int	increasingSeqOf3withMaxProduct(int ptr){
	if(ptr>2){
	int current=a[ptr],count=1, product=a[ptr];
		for(int i=ptr-1;i>=0 && count<=3;i--){
			if(a[i]<current){
			count++;
			product=product*a[i];
			}
		}
		if(count<3)product=0;
	return max(product, increasingSeqOf3withMaxProduct(ptr-1));
	}
return 0;
}

void iso3wmp(int ptr, int count, int product){
	System.out.println("("+ptr+","+count+","+product+")");
if(count<=3 && ptr>=0){
	iso3wmp(ptr-1,count, product);
	int current=a[ptr];
	for(int i=ptr-1;i>=0 && count<=3;i--){
		if(a[i]<current){
			iso3wmp(i,count+1, product*a[i]);
		}
	}	
}
else{
if(count==3){
if(product>max)max=product;	
}	
}
}

int max(int a, int b){
if(a==b)return a;
return a>b?a:b;
}

public static void main(String args[]){
LIS lis=new LIS();
lis.iso3wmp(7,1,lis.a[7]);
System.out.println("max="+lis.max);
}
}
