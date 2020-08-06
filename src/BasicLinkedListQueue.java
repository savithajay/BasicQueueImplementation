
public class BasicLinkedListQueue {

	private int front;
	private int tail;
	private int qLength;
	private int[] llQueue;
	
	BasicLinkedListQueue(int length) {
		front = 0;
		tail = 0;
		qLength = length;
		llQueue = new int[qLength];
	}
	
	public int getQueueLength() {
		if(front == -1 && tail == -1) {
			return 0;
		} else {
			return tail - front;
		}
	}
	
	public void enqueue(int item) {
		if(qLength == tail) {
			throw new IllegalStateException("The queue full.");
		} else {
			llQueue[tail] = item;
			tail++;
		}
	}
	
	public int dequeue() {
		int curItem;
		if(getQueueLength() == 0) {
			System.out.println("Queue is empty");
			return 0;
		} else if(front == tail) {
			curItem = llQueue[front];
			llQueue[front] = llQueue[tail];
			front = -1;
			tail = -1;
		} else {
			curItem = llQueue[front + 1];
			front++;
			
		}
		
		return curItem;
	}
	
	public void displayQueueItems() {
		if(front == tail) {
			System.out.println("");
			return;
		}
		
		for(int i = 0; i <= getQueueLength() - 1; i++) {
			System.out.println(llQueue[i]);
		}
	}
	
	public void getAnItem(int position) {
		if(getQueueLength() == 0) {
			System.out.println("Queue is empty");
			return;
		}
		
		for(int i = front; i < tail; i++) {
			if(i == position) {
				System.out.println("The item at position " + position + " is " + llQueue[i-1]);
				return;
			}
		}
		
		System.out.println("Position could not be found");
	}
	
	public boolean contains(int item) {
		boolean itemFound = false;
		if(getQueueLength() == 0) {
			return itemFound;
		}
		for(int i = front; i < tail; i++) {
			if(llQueue[i] == item) {
				itemFound = true;
				break;
			}
		}
		
		return itemFound;
	}
}
