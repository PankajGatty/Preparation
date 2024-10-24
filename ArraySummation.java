//1.SUM OF THE ARRAY
public class ArraySummation{
	public static void main(String[] args) {
		int[] array={1,2,5,50,100,200,1000};
		int n=array.length;
		int sum=sumOfArray(array,n);
		System.out.println("SUM OF THE ARRAY IS :"+sum);

	}
	public static int sumOfArray(int[] array,int n){
		int sum=0;
		for(int i =0;i<n;i++){
			sum=sum+array[i];
		}
		return sum;
		
	}
}