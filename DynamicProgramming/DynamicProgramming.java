package dynamicProgrammingExample;

import java.util.HashMap;

public class DynamicProgramming {
		static int cnt = 0;
		static int index = 40;
		static int temp = 0;
		
		static double before = 0;
		static double after = 0;
		
		public static void main(String[] args) {
			System.out.println("# Bottom-Up Start...");
			
			// Bottom-Up
			before = System.currentTimeMillis();
			temp = Fibonacci(index);
			after = System.currentTimeMillis();
			
			System.out.println("1. Bottom-Up result is.. /  " + index +" calling fn count.. / " + cnt +"  installing time.. / " + (after - before) + "ms");
			
			System.out.println("# Bottom-Up End...");
			
			// init
			
			System.out.println("# Top-Down Start...");
			
			cnt = 0;
			temp = 0;
			
			HashMap<Integer, Integer> db = new HashMap<>();
			
			
			before = System.currentTimeMillis();
			temp = Fibonacci_Memoization(index, db);
			after = System.currentTimeMillis();
			
			System.out.println("2. Top-Down result is.. /  " + index  +" calling fn count.. / " + cnt +"  installing time.. / " + (after - before) + "ms");
			
			System.out.println("# Top-Down End...");
			
		}
		
		public static int Fibonacci(int n) {
			cnt ++;
			
			if(n == 0) {
				return 0;
			}else if (n <= 2) {
				return 1;
			}else {
				return Fibonacci(n -1) + Fibonacci(n -2);
			}
			
		}
		
		public static int Fibonacci_Memoization(int n, HashMap<Integer, Integer> db) {
			cnt++;
			
			if(db.containsKey(n)) {	// overlap value
				return db.get(n);		// getData
			}else if (n == 0) {
				return 0;
			}else if (n <= 2) {
				return 1;
			}else {
				int value = Fibonacci_Memoization(n-1, db) + (Fibonacci_Memoization(n -2, db));
				db.put(n, value);
				return value;
			}
			
		}
}
