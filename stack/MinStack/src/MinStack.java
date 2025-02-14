package stack.MinStack.src;

import java.util.Objects;
import java.util.Stack;

public class MinStack {
    private final Stack<Integer> mainStack = new Stack<>();
    private final Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        if (minStack.isEmpty()) {
            minStack.add(val);
        } else if (val <= minStack.peek()) {
            minStack.add(val);
        }
        mainStack.add(val);
    }

    public void pop() {
        if (Objects.equals(mainStack.pop(), minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
