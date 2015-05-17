package swing;

import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollBarTest extends JFrame {

	JTextArea JTA;
	JScrollPane JSP;

	TextArea oldMessageTextArea;
	TextArea sendMessageTextArea;
	JList userList;
	JScrollPane userListPane;
	JButton btSend;
	JButton btClosed;
	JButton upLine;
	String doubleClickedName;
	String clientName;
	JLabel userlistTitle;
	Vector users;
	
	public ScrollBarTest() {
		this.setTitle("欢迎您：" + clientName);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int x = (int) screenSize.getWidth();
		int y = (int) screenSize.getHeight();
		this.setBounds((x - 600) / 2, (y - 600) / 2, 600, 600);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		// 设置已经发出去的消息窗口的属性
//		oldMessageTextArea = new TextArea();
//		oldMessageTextArea.setBounds(0, 0, 390, 360);
//
//		// 设置准备发送消息窗口的属性
//		sendMessageTextArea = new TextArea(3, 3);
//		sendMessageTextArea.setBounds(0, 380, 390, 140);
//		sendMessageTextArea.addKeyListener(new KeyAdapter() {
//			public void keyTyped(KeyEvent e) {
//				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//					System.out
//							.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//				}
//			}
//
//		});
//
//		// 设置<上线>按钮的属性
//		upLine = new JButton("上线");
//		upLine.setBounds(0, 530, 70, 30);
//		
//		// 注册<上线>按钮的点击事件
//		upLine.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				upLine.setEnabled(false);
//				String s = sendMessageTextArea.getText();
//				sendMessageTextArea.setText("");
//			}
//		});
//
//		// 设置<发送>按钮的属性
//		btSend = new JButton("发送");
//		btSend.setBounds(240, 530, 70, 30);
//		
//		// 注册<发送>按钮的点击事件
//		btSend.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				upLine.setEnabled(false);
//				String s1 = sendMessageTextArea.getText();
//				String s = s1.replaceAll("\r\n", "�");
//				sendMessageTextArea.setText("");
//			}
//		});
//		
//		// 设置<关闭>按钮的属性
//		btClosed = new JButton("关闭");
//		btClosed.setBounds(320, 530, 70, 30);
//		
//		// 注册<关闭>按钮的点击事件
//		btClosed.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				// AllTalkFrame.this.dispose();
//				System.exit(0);
//			}
//		});
//
//		// 设置用户列表的标题
//		userlistTitle = new JLabel("当前在线用户列表,双击进行私聊");
//		userlistTitle.setBounds(400, 0, 200, 20);
		
		// 设置用户列表JList属性
		userList = new JList();
		userList.setBounds(400, 20, 200, 600);
//		users = new Vector();
		
		
		// 设置用户列表JScrollPane的属性
		userListPane = new JScrollPane(userList,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		userListPane.setBounds(400, 20, 180, 500);


		// 将所有组件添加到窗体上
//		this.add(oldMessageTextArea);
//		this.add(sendMessageTextArea);
//		this.add(btSend);
//		this.add(upLine);
//		this.add(btClosed);
		this.add(userListPane);
//		this.add(userlistTitle);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ScrollBarTest();
	}

}
