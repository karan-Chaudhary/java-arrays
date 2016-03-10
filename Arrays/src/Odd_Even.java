
public class Odd_Even {

	public static void main(String[] args) {
		int number[]={5,6,7,8,9,10,11,12,13};
		for(int i=0;i<number.length;i++){
			
			if(number[i]%2==0){
				System.out.println(number[i]+" is an even.");
			}
			else{
				System.out.println(number[i]+" is an odd.");
			}
		}
	}
}


