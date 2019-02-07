package stackExample;

public class StackMain {
	
	public static void main(String[] args) {
		int stackSize = 5;
		String deleteItem = null;
		ArrayStack stack = new ArrayStack(stackSize);
		
		stack.push("S");
		stack.printStack();
		
		stack.push("T");
		stack.push("A");
		stack.push("C");
		stack.push("K");
		stack.printStack();
		
		deleteItem = stack.pop();
		
		if(!deleteItem.isEmpty()) {
			System.out.println("deleted Item : " + deleteItem);
		}
		
		stack.printStack();
	}
	
}
