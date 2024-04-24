package stackdemo;

/**
 *
 * @author prakasa putra
 * GitHub Code: https://github.com/prakasap05/Stack
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(6);
        stack.printStack();
        stack.push(2);
        stack.printStack();
        
        System.out.println("Tambah beberapa data"); // adding some data
        stack.push(3);
        stack.printStack();
        stack.push(4);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.push(7);
        stack.printStack();
        stack.push(8);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("Menghapus semua data"); // clearing all data
        stack.clearStack();
        stack.printStack();
    }
    
}
