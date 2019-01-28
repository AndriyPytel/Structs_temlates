public interface Node_struct<T> {

    void push(T item);
    void pop();
    T get();
    int len();
    boolean empty();

    class Node<T> {
        T val;
        Node next;
        Node previous;

        Node(T value){
            val = value;
        }
    }

}
