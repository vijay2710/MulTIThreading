

public class Producer extends Thread {
	private Box box;
	
	public Producer(Box box) {
		this.box = box;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		String[] msgs = {"Romeo","Romeo","wherefore", "art", "thou?"};
		
		for(String message : msgs) {
			box.put(message);
		}
		
		box.put("DONE");
	}
}
