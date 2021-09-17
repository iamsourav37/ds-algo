package stack;

public class StackUsingArray {

	private final int size;
	private int top;
	private final int[] stack;

	public StackUsingArray(int size){
		this.size = size;
		this.top = -1;
		stack = new int[size];
	}

	private boolean isOverflow(){
		return this.top == this.size-1;
	}

	private boolean isUnderflow(){
		return this.top == -1;
	}

	public void push(int data){
		if(this.isOverflow()){
			System.out.println("Stack is overflow");
			return;
		}

		this.top++;
		this.stack[this.top] = data;
	}

	public int pop(){
		if(this.isUnderflow()){
			System.out.println("Stack is underflow");
			return -1;
		}

		int temp = this.stack[this.top];
		this.top--;
		return temp;
	}

	public int peek(){
		if(this.isUnderflow()){
			System.out.println("Stack is underflow");
			return -1;
		}

		return this.stack[this.top];
	}

	public void display(){
		if(this.isUnderflow()){
			System.out.println("Stack is underflow");
			return;
		}

		System.out.println("Stack elements : ");
		for(int i=this.top; i>=0; i--){
			System.out.println(this.stack[i]);
		}
	}


	public static void main(String[] args){
		StackUsingArray stack = new StackUsingArray(5);

		stack.push(12);
		stack.push(23);
		stack.push(32);
		stack.push(34);
		stack.push(39);
		stack.push(33);
		stack.push(10);

		stack.display();

		System.out.println("Poped element : "+stack.pop());

		System.out.println("Peek : "+ stack.peek());

		System.out.println("After pop");
		stack.display();

	}
}

