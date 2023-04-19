package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		float var1 = 0.123456789123456789f;
		double var2 = 0.123456789123456789;
		
		System.out.println(var1);
		System.out.println(var2);
							
		double var3 = 3e6; // 3 x 10^6
		float var4 = 3e6F; // 3 x 10^6
		double var5 = 2e-3; // 2 x 10^-3
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}

}
