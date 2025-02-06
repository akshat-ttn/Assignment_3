class SpecialStack{
    int[] stack;
    int[] minStack;
    int maxSize;
    int top;
    int minTop;

    public SpecialStack(int maxSize) {
        this.maxSize=maxSize;
        this.stack = new int[maxSize];
        this.minStack = new int[maxSize];
        this.top = -1;
        this.minTop = -1;
    }
    public void print(){
        System.out.println("----------------------------");
        for(int stack : stack)
            System.out.print(stack+"<-");
        System.out.println();
        System.out.println("----------------------------");
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
    public void push(int input){
        if(isFull()) {
            System.out.println("Stack is Full.");
            return;
        }
        top++;
        stack[top] = input;
        if (minTop == -1 || input <= minStack[minTop]) {
            minTop++;
            minStack[minTop] = input;
        }
    }

    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }
        int pop = stack[top];
        top--;
        if(pop == minStack[minTop])
            minTop--;
        return pop;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }return stack[top];
    }
    public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }
        return minStack[minTop];
    }
}
public class Question_3 {
    public static void main(String[] args) {
        SpecialStack ss = new SpecialStack(6);
        ss.push(22);
        ss.push(53);
        ss.push(3);
        ss.push(15);
        ss.push(65);
        ss.push(1);
        ss.print();
        System.out.println(ss.getMin());
        ss.pop();
        System.out.println(ss.getMin());



    }
}
