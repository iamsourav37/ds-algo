package stack;

class Node{
    int data;
    Node next;
}

public class StackUsingLinkedList {

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.pop();

        stack.push(29);
        stack.push(89);
        stack.push(56);
        stack.push(31);

        stack.display();

        System.out.println("Poped element : "+ stack.pop());
        System.out.println("Peek element : "+ stack.peek());

        System.out.println("After pop ");
        stack.display();
    }

    private Node head;

    public StackUsingLinkedList(){
        this.head = null;
    }

    public void push(int data){
        Node node = new Node();
        node.data = data;
        node.next = this.head;
        this.head = node;
    }

    public int pop(){
        if(this.head == null){
            System.out.println("Stack is underflow");
            return -1;
        }

        Node temp = this.head;
        this.head = this.head.next;
        return temp.data;
    }

    public int peek(){
        if(this.head == null){
            System.out.println("Stack is underflow");
            return -1;
        }

        return this.head.data;
    }

    public void display(){
        if(this.head == null){
            System.out.println("Stack is underflow");
            return;
        }

        Node temp = this.head;

        System.out.println("Stack elements : ");
        while(temp != null){
            System.out.println(temp.data);

            temp = temp.next;
        }
    }

}
