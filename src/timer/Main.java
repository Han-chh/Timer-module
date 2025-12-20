package timer;

import java.awt.Font;
import java.awt.event.*;
import java.util.concurrent.locks.*;
import javax.swing.*;

public class Main {

    static float Timer = 0;
    static JLabel timer = new JLabel(Timer + " s");
    static Lock lock = new ReentrantLock();
    static Condition notPause = lock.newCondition();
    static Condition pause = lock.newCondition();
    static boolean isPause = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Timer");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(400, 200, 250, 300);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(timer);
        timer.setFont(new Font("Sancerif", Font.BOLD, 19));
        Thread refresh = new Thread(new Refresh());
        refresh.start();

        JButton start = new JButton("start");
        frame.add(start);
        JButton restart = new JButton("restart");
        restart.setEnabled(false);
        frame.add(restart);
        JButton pause = new JButton("pause");
        frame.add(pause);

        timer.setBounds(95, 10, 100, 30);
        start.setBounds(70, 60, 100, 30);
        pause.setBounds(70, 120, 100, 30);
        restart.setBounds(70, 180, 100, 30);

        start.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO 自动生成的方法存根
                restart.setEnabled(true);
                if (isPause) {
                    isPause = false;
                    pause.setEnabled(true);
                    start.setEnabled(false);
                    restart.setEnabled(true);
                }
            }
        });

        restart.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO 自动生成的方法存根
                pause.setEnabled(false);
                start.setEnabled(true);
                restart.setEnabled(false);
                isPause = true;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e1) {
                    // TODO 自动生成的 catch 块
                    e1.printStackTrace();
                }
                Timer = 0;
            }
        });

        pause.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO 自动生成的方法存根
                pause.setEnabled(false);
                start.setEnabled(true);
                restart.setEnabled(true);
                isPause = true;
            }
        });

        Thread timerThread = new Thread(new Timer());
        timerThread.start();
    }
}
