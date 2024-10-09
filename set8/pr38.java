import java.util.ArrayList;

public class pr38 {
    private ArrayList<Object> list;

    public pr38() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    public static void main(String[] args) {
        pr38 stack = new pr38();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Should print 30
        System.out.println("Stack size: " + stack.getSize()); // Should print 3

        stack.pop(); // Removes 30
        System.out.println("Top element after pop: " + stack.peek()); // Should print 20
    }
}
