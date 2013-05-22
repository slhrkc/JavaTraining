import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;


public class Threads extends RecursiveAction implements Runnable {

	@Override
	public void run() {
		System.out.println("I am running on the object "+this.toString());
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	Threads(){
		Thread t = new Thread(this);
		t.start();
	}
	public static void main(String[] args) {
		Executor te = Executors.newFixedThreadPool(10);
		
		
		// TODO Auto-generated method stub
		Threads th = new Threads();
		Threads th1 = new Threads();
		te.execute(th);
		te.execute(th1);


		
		Thread t = new Thread(th,"0001");
		t.start();
		Thread t1 = new Thread(th,"0002");
		t1.start();
		Thread temp = new Thread(new Runnable(){
			public void run(){
				System.out.println("Hellas");
			}
		});
		try {
			temp.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		temp.start();
		

	}

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		
		
	}

}
