class MyThread extends Thread{
	public void run() {
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
		//run();
	}
	/*public void Start() {
		System.out.println("In Start");
		run();
	}*/
}
public class ThreadDemo {
public static void main(String[] args) {
	MyThread obj = new MyThread();
	obj.start();
	System.out.println(Thread.currentThread().getName());
	//obj.setName("custom");
	//obj.start();
	
}
}
