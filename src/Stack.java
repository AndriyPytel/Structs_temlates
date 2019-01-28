public class Stack<T> implements Node_struct{

    private Node<T> last = null;
    private int count = 0;

    Stack(T ... items) {
        if (items.length > 0) {
            for (T item : items) this.push(item);
        }
    }

    synchronized public void push(Object item){
        Node<T> new_item = new Node<T>((T) item);
        if (count > 0){
            last.next = new_item;
            new_item.previous = last;
        }
        last = new_item;
        count++;
    }

    synchronized public void pop(){
        if (!this.empty()) {
            last = last.previous;
            count--;
        }
        else
            System.out.println("Error: Stack is empty");

    }

    synchronized public T get(){
        return last.val;
    }

    public int len(){
        return count;
    }

    public boolean empty(){
        return (count == 0);
    }
}
