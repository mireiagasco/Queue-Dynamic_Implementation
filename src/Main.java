public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new Queue<>();

        System.out.println("\n>>>Enqueueing numbers from 0 to 9");
        for (int i = 0; i < 10; i++){
            queue.enqueue(i);
        }
        System.out.println("\nDone.  Queue obtained:");
        System.out.println(queue);
        System.out.println("Size of the queue: " + queue.getSize());

        System.out.println("\n>>>Dequeueing 5 elements");

        try {
            System.out.println("First element: " + queue.dequeue());
            System.out.println("Second element: " + queue.dequeue());
            System.out.println("Third element: " + queue.dequeue());
            System.out.println("Fourth element: " + queue.dequeue());
            System.out.println("Fifth element: " + queue.dequeue());
        }
        catch (QueueIsEmpty e){
            System.out.println(e);
        }

        System.out.println("\nDone.  Queue obtained:");
        System.out.println(queue);
        System.out.println("Size of the queue: " + queue.getSize());


        System.out.println("\n>>>Enqueueing numbers from 10 to 19");
        for (int i = 10; i < 20; i++){
            queue.enqueue(i);
        }
        System.out.println("\nDone.  Queue obtained:");
        System.out.println(queue);
        System.out.println("Size of the queue: " + queue.getSize());
    }
}
