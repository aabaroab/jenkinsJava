package fibonacci;

class test {
	public static void main(String args[]) {
		
		System.out.println(initialNumber+" "+secondNumber);	
		for(int i=2;i<count;i++) {
			lastNumber = initialNumber + secondNumber;
			System.out.println(" " + lastNumber);
			initialNumber = secondNumber;
			secondNumber = lastNumber;
		}
	}
}
