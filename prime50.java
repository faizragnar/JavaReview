public class prime50{
	public static void main(String[] args){
		
	int temp=1;
	int current=2;
	boolean isprime=true;
	int count = 0;
	while(count <=50){
			
		if(count%temp==0){ 
		count ++;
			continue;
		}
		if(count>2) {
			isprime= false;
		
		}
		if(isprime) System.out.println(current);
		current++;
	}
		
		
	}
}