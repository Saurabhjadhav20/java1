
class TestJoinMethod1 extends Thread{\
	public void run() {
	for(int i=1; i<=5; i++) {
		try {
			Thread.sleep(500);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}

public static void main(String[] args) {
	ThestJoinMethod1 t1 = new TestJoinMethod1();
	ThestJoinMethod1 t2 = new TestJoinMethod1();
	ThestJoinMethod1 t3 = new TestJoinMethod1();
	t1.start();
	try {
		Thread
	}
}
}
public class ThreadRunCall {
public static void main(String[] args) {
	MessageThread t1 = new MessageThread();
	TableThread t2 = new TableThread();
	t1.run();
	t2.run();
}
}
