
public class Homer implements Runnable {

	

	@Override
	public void run() {
		for (int i=0;i<40;i++){
			Home.increceNum();
		}

	}

}
