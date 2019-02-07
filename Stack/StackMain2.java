package stackExample;

public class StackMain2 {
	public static void main(String[] args) {
		String deleteItem = null;
		LinkedStack lStack = new LinkedStack();
		
		lStack.push("I");
		lStack.push("AM");
		lStack.push("A");
		lStack.push("BOY");
		
		lStack.printStack();
		
		deleteItem = lStack.pop();
		if(!deleteItem.isEmpty()) {
			System.out.println("deleted Item : " + deleteItem);
		}
		
		lStack.printStack();
	}
}
