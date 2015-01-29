
public class Home {
	private static int num;

	public static void main(String[] args) {
	Thread k1=new Thread(new Homer());
	Thread k2=new Thread(new Homer());
	Thread k3=new Thread(new Homer());
	k1.start();
	k2.start();
	k3.start();
	
	try {
		k1.join();
		k2.join();
		k3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(num);
	}
	public static synchronized void increceNum(){
		num++;
	}

}
