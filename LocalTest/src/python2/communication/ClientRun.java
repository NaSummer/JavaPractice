package python2.communication;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Qiufan(Andy) Xu 
 * @date CreateTime: 2015年10月20日 上午10:43:07 
 * @version 1.0 
 * @param 
 */

public class ClientRun {
	
	
	public static void main(String[] args) {
		
		Client client = new Client();
		
		
	}
	
	class Client {
		
		Socket client;
		
		public Client() {
			try {
				client = new Socket("127.0.0.1", 9999);
				OutputStream os = client.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/**
		 * 
		 * @param 
		 * @return 
		 */
		public void send(String str) {
			
			// TODO Auto-generated method stub
		}
		
	}

}
