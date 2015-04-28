import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class start extends JFrame implements ActionListener {
	private JButton btn;
	private JTextArea are;
	private BufferedReader br = null;
	private int count = 0;
	private JButton tuichu;

	start() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 600, 700);
		btn = new JButton("Start");
		are = new JTextArea();
		tuichu = new JButton("Quit");
		this.add(tuichu);
		this.add(are);
		this.add(btn);
		this.setLayout(null);
		are.setBounds(0, 100, 600, 550);
		are.setFont(new java.awt.Font("ËÎÌו", 2, 7));
		btn.setBounds(0, 0, 75, 50);
		tuichu.setBounds(300, 0, 75, 50);
		btn.addActionListener(this);
		tuichu.addActionListener(this);
		this.setVisible(true);
		validate();
	}

	public void animation() {

		while (count < 104700) {
			try {
				Thread.sleep(100);
				count = count + 60;
				br = new BufferedReader(new FileReader("bad apple/" + count
						+ ".txt"));
				String str = null;
				while (null != (str = br.readLine())) {
					are.append(str + "\n");
				}
				pause();
				are.setText("");
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(-1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void pause() {
		try {
			Thread.sleep(20L);
		} catch (InterruptedException e) {
			System.out.print("sleep is wrong!");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			music m = new music();
			m.start();
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					for (int j = 60; j < 104700; j = j + 60) {
						animation();
					}
				}
			};
			new Thread(runnable).start();
		} else {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new start();

	}
}
