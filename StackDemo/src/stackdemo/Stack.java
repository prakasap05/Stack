package stackdemo;

/**
 *
 * @author prakasa putra
 * GitHub Code: https://github.com/prakasap05/Stack
 */
public class Stack {
    private Node next; // pointer to the next code
    private int height; // height of the stack
    private Node top; // pointer to the top node
    
    /**
     * constructs an empty stack.
     */
    Stack() {
        emptyStack(); // initialize an empty stack
    }
    
    /**
     * represents a node in the stack.
     */
    class Node {
        int value; // value stored in the node
        Node next; // pointer to the next node
        
        /**
         * constructs a node with the given value.
         * @param value the value to the be stored in the node 
         */
        Node(int value) {
            this.value = value;
        }
    }
    
    /**
     * constructs a stack with a single node containing the given value.
     * @param value the value to be stored in the initial node
     */
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode; // set the top node to the new node
        height = 1; // set the height of the stack to 1
    }
    
    /**
     * prints the value of the top node.
     */
    public void getTop() {
        if (top == null) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
    }
    
    /**
     * pushes a new node with the given value onto the stack.
     * @param value the value to be stored in the new node
     */
    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    
    /**
     * pops the top node from the stack.
     * @return the popped node
     */
    public Node pop() {
        if (height == 0) return null;
        
        Node temp = top;
        top = top.next;
        temp.next = null;
        
        height--;
        return temp;
    }
    
    /**
     * prints all values in the stack.
     */
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.value + "\n");
            current = current.next;
        }
        System.out.println();
    }
    
    /**
     * checks if the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    public boolean empty() {
        return height == 0;
    }

    private void emptyStack() {
        top = null;
        height = 0;
    }
    
    /**
     * clears all nodes from the stack.
     */
    public void clearStack() {
        top = null;
        height = 0;
    }
    
}
