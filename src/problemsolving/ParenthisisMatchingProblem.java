package problemsolving;

public class ParenthisisMatchingProblem {
    public static void main(String[] args) {
        String expression = "(5+4) * (3*3) + 9";
        String expression2 = "(5+4) * (3*3) + 9)))";

        System.out.println(expression+" isParenthesisMatched : "+isParenthesisMatched(expression));
        System.out.println(expression2+" isParenthesisMatched : "+isParenthesisMatched(expression2));


    }

    public static boolean isParenthesisMatched(String exp){

        char[] expressionArray = exp.toCharArray();
        Stack stack = new Stack(expressionArray.length);

        for (char c : expressionArray) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                try {
                    stack.pop();
                } catch (Exception e) {
                    return false;
                }
            }
        }

       // check our stack is empty or not. If empty return true otherwise return false

        try{
            stack.pop(); // if this line does not throw exception then stack is not empty reutrn false
            return false;
        }catch (Exception e){
                // stack is empty thats why it throw exception, return true;
            return true;
        }

    }
}


class Stack{
    private int capacity;
    private char[] stack;
    private int top;

    public Stack(int capacity){
        this.capacity = capacity;
        this.stack = new char[capacity];
        this.top = -1;
    }

    private boolean isFull(){
        return this.top == this.capacity-1;
    }

    private boolean isEmpty(){
        return this.top == -1;
    }

    public void push(char data){
//        if(this.isFull()){
//            throw new Exception("Stack is overflow");
//        } // no need for checking for isFull in this case

        this.top++;
        this.stack[this.top] = data;
    }

    public void pop() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Stack is underflow");
        }
        this.top--;
    }
    public char peek() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Stack is underflow");
        }
        return this.stack[this.top];
    }


}