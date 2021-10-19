package bubbleSore;

import bubbleSore.Sort;

public class Main {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 3;
		
		Sort sr = new Sort();
		
		sr.swap(a,b);
		
		System.out.printf("%d %d", a, b);

	}

}
