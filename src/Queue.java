/**
 * Dynamic implementation of a queue using generics
 * @author Mireia Gasco Agorreta
 * @version 1.0
 *
 * @param <T> type of the objects that will be stored in the queue.
 */
public class Queue<T> {

    /**
     * Class for the nodes of the queue.
     * @param <T> type of object.
     */
    public class Node<T> {

        //Attributes
        private T data;
        private Node next;

        //Constructor
        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    //Attributes
    private Node start;     //node to be dequeued
    private Node end;       //last node enqueued
    private int size;       //number of elements on the queue

    //Constructor
    public Queue() {
        this.size = 0;
        this.start = null;
        this.end = null;
    }

    /**
     * Enqueue method.  Adds the data passed as an argument to the queue.
     * @param data data to be enqueued.
     */
    public void enqueue(T data){
        Node newNode = new Node(data, null);

        if (isEmpty()){
            this.start = newNode;
        }
        else{
            this.end.next = newNode;
        }

        this.end = newNode;
        this.size++;
    }

    /**
     * Dequeue method.  Removes and returns the first element on the queue.
     * @return the firts element on the queue.
     */
    public T dequeue() throws QueueIsEmpty{
        if (getSize() == 0) throw new QueueIsEmpty();
        Node dequeued = this.start;
        this.start = this.start.next;
        this.size--;

        return (T)dequeued.data;
    }

    /**
     * Size method.  Indicates the number of elements waiting in the queue.
     * @return the size of the queue.
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Empty method.  Indicates if the queue is empty.
     * @return true if the queue is empty, false if it is not.
     */
    public boolean isEmpty(){
        return this.size == 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nStart --> ");

        Node aux = this.start;

        while (aux != null){
            sb.append(aux.data + " ");
            aux = aux.next;
        }

        sb.append("<-- End");

        return sb.toString();
    }
}
