package Controller;

public class ExeController extends Thread {
		private int JJ;
		

	public ExeController(int JJ) {
		this.JJ =  JJ;
		
	}
	
	public void run() {
		System.out.println("Thread--> " + JJ);
	}

}
