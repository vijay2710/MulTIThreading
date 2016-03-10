

public class Consumer extends Thread {
	private Box box;
	
	public Consumer(Box box) {
		this.box = box;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(String message = box.take(); !message.equals("DONE"); message = box.take()) {
			System.out.println(message);
		}
	}
}
