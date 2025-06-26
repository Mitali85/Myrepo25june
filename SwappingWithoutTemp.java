package SwapNumber;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=10;
		
		System.out.println("Before swapping:a = " + a + ", b = " + b);
		 
		//swapping without a temp variable
		
		a=a+b;   //a now become 15
		b=a-b;   //b become 5(15-10)
		a=a-b;   //a become 10(15-5)
		
		System.out.println("After swapping:a = " + a + ", b = " + b);

	}

}
