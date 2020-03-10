package lab1update;

public class Runner {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		
		for (int i = 0; i < 10; i++) {
			c.incrementTotal();
		}
		
		System.out.println(c.getTotal());
	}

}
