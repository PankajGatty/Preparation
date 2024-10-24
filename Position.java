public class Position{
	public static void main(String[] args) {
		String name="kanaka";
		char ch='n';

		int value=firstPosition(name,ch);
		System.out.println(value);
	}
	public static int firstPosition(String name,char ch){

		char[] positionValue=name.toCharArray();

		for(int i=0;i<positionValue.length;i++){
			if(positionValue[i]==ch){
				return i;

			}
		}
		return -1;
	}
}