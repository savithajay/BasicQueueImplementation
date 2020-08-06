
public class QueueTest {

	public static void main(String[] args) {
		
		BasicLinkedListQueue queue = new BasicLinkedListQueue(5);
		queue.enqueue(3);
		queue.enqueue(1);
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.displayQueueItems();
		
		System.out.println("Size - " + queue.getQueueLength());
		queue.getAnItem(3);
		
		queue.dequeue();
		queue.displayQueueItems();
		System.out.println("Size - " + queue.getQueueLength());
		
		System.out.println("Item 5 is in the queue - " + queue.contains(5)) ;
		System.out.println("Item 12 is in the queue - " + queue.contains(12)) ;
		queue.getAnItem(2);
		
		queue.dequeue();
		queue.displayQueueItems();
		System.out.println("Size - " + queue.getQueueLength());
		

	}

}
