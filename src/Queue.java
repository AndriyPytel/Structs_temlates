public class Queue<T> implements Node_struct {

    private Node<T> last = null;
    private Node<T> first = null;
    private int count = 0;

    Queue(){
        first = last;
    }

    Queue(T ... items){
        first = last;
        for(T item: items)
            push(item);

    }

    synchronized public T get(){
        return !this.empty()? first.val : null;
    }

    public void push(Object item) {
        Node<T> new_item = new Node<T>((T) item);
        if (count > 0){
            last.next = new_item;
            new_item.previous = last;
        }
        else {
            first = new_item;
            first.previous = null;
        }
        last = new_item;
        count++;
    }

    synchronized public void pop(){
        if (!this.empty()) {
            first = first.next;
            count--;
        }
    }

    public int len(){
        return count;
    }

    public boolean empty(){
        return (count == 0);
    }

}
