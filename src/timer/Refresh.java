package timer;

public class Refresh implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true) {
			String timer_str = String.format("%.2f", Main.Timer);
			Main.timer.setText(timer_str+" s");				
		}
	}

}
