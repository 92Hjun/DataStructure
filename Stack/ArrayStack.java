package stackExample;

public class ArrayStack implements Stack{
	
	private int top;
	private int stackSize;
	private String[] itemArray;
	
	public ArrayStack(int stackSize) {
		this.top = -1;
		this.stackSize = stackSize;
		itemArray = new String[this.stackSize];
	}
	
	@Override
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == this.stackSize -1);
	}

	@Override
	public void push(String item) {
		if(isFull()) {
			System.out.println("Stack over flow....");
		}else {
			itemArray[++top] = item;
			System.out.println("Insert item : " + item);
		}
		
	}

	@Override
	public String pop() {
		if(isEmpty()) {
			System.out.println("Stack is Underflow...");
			return null;
		}else {
			return itemArray[top--];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail... Stack is Empty...");
		}else {
			top--;
		}
	}

	@Override
	public String top() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...");
			return null;
		}else {
			return itemArray[top];
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...");
		}else {
			System.out.println("Array Stack... >>");
			for (int i = 0; i <= top; i++) {
				System.out.print(itemArray[i] + "  ");
			}
			System.out.println("");
		}
	}
}
