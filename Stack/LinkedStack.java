package stackExample;

public class LinkedStack implements Stack{
	
	private StackNode top;
	
	@Override
	public boolean isEmpty() {
		return (top == null);
	}

	@Override
	public void push(String item) {
		StackNode newNode = new StackNode(item, top);
		top = newNode;
		System.out.println("Inserted data : " + item);
		
	}

	@Override
	public String pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty... ");
			return null;
		}else {
			String item = top.getData();
			top = top.getLink();
			return item;
		}
		
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...");
		}else {
			top = top.getLink();
		}
		
	}

	@Override
	public String top() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...");
			return null;
		}else {
			return top.getData();
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...");
		}else {
			StackNode tmp = top;
			System.out.println("Linked Stack >> ");
			while(tmp != null) {
				System.out.print("   " + tmp.getData() + "   ");
				tmp = tmp.getLink();
			}
			System.out.println("");
		}
	}

}
