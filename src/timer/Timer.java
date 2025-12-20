package timer;

public class Timer implements Runnable{

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1); // 保证 CPU 不占满
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (!Main.isPause) {
				Main.Timer += 0.001f;
				System.out.println("Timer running: " + Main.Timer);
			}
		}

	}
}


