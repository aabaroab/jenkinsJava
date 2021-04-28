package fibonacci;

class test {
	public static void main(String args[]) {
		int initialNumber= 0;
		int secondNumber = 1;
		int lastNumber;
		int count = 10;
		
		System.out.println(initialNumber+" "+secondNumber);	
		for(int i=2;i<count;i++) {
			lastNumber = initialNumber + secondNumber;
			System.out.println(" " + lastNumber);
			initialNumber = secondNumber;
			secondNumber = lastNumber;
		}
	}
}
