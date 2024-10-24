public class oddEvenAnalyser{
	public static void main(String[] args) {
		int[] number={1,2,10,55,63,69,72,20,100};
		int n=number.length;

		oddEvenCount(number,n);

	}
	public static void oddEvenCount(int[] number,int n){
		int oddCount=0;
		int evenCount=0;

		for(int i=0;i<n;i++){
			if(number[i]%2==0){
				evenCount++;
			}
			else{
				oddCount++;
			}
		}
		System.out.println("Even Count:"+evenCount);
	System.out.println("Odd Count:"+oddCount);

	}
	
}