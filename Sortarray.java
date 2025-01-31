public class Sortarray{
	public static void main(String args[]){
	
	int[] arr = {1,2,3,7,2,4,6};
	int temp=0;
	
	for(int i=0; i<arr.length-1;i++){
		for(int j=1;j<arr.length-1;j++){
			if(arr[i]>arr[j]){
			temp =arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			
			}
		}
		
	}
	}
	for(int i=0;i<arr.length;i++){	
		System.out.print(arr[i]);
	}
	}
	
}