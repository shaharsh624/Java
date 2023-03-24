package src;
import java.util.ArrayList;
import java.util.List;
interface stack{
    void push(int element);
    int pop();
}

// Static Stack implementing stack(interface)
class staticStack implements stack {
    int stk[];
    int top;

    staticStack(int size) {
        stk = new int[5];
        top = -1;
    }

    //Push
    public void push(int item) {
        if (top == stk.length - 1) {
            System.out.println("Stack Overflows");
            int t[] = new int[stk.length * 2];
            for (int i = 0; i < stk.length; i++)
                t[i] = stk[i];
            stk = t;
            stk[++top] = item;
        } else
            stk[++top] = item;
    }

    //Pop
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflows");
            return 0;
        } else
            return stk[top--];
    }
}

// Dynamic Stack implementing stack(interface)
class DynStack implements stack {
    List<String> dStack = new ArrayList<>();

    // Push
    public void push(int element) {
        dStack.add(String.valueOf(element));
    }

    // Pop
    public int pop() {
        if (!isEmpty()) { // checks for an empty Stack
            int popValue = Integer.parseInt(dStack.get(dStack.size() - 1));
            dStack.remove(dStack.size() - 1); // removes the poped element             
            return popValue;
        }
        else {
            System.out.print("The stack is already empty  ");
            return -1;
        }
    }

    // Checking if the Stack is Empty/Full
    boolean isEmpty() {
        if (dStack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    // Returns the top most element in Stack
    String peek() {
        return dStack.get(dStack.size() - 1);
    }
}

public class Stack1{
    public static void main(String[] args) {

        staticStack ss = new staticStack(5);
        for(int i=0;i<3;i++) {
            ss.push(i);
        }
        System.out.println("StaticStack Contents are.");
        for(int i=0;i<3;i++) {
            System.out.println(ss.pop());
        }

        DynStack ds = new DynStack();
        System.out.println("\nIs DynStack Empty: "+ds.isEmpty()); //isFull
        ds.push(1); //Push
        ds.push(2); //Push
        ds.push(3); //Push
        ds.push(4); //Push
        System.out.println("Is DynStack Empty: " + ds.isEmpty()); //isEmpty
        System.out.println("Pop Top Element: " + ds.pop()); //Pop
        System.out.println("The Top most element (after pop) in DynStack is: " + ds.peek()); //Top Most Element
    }
}