import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {
	public static void main(String args[]) {
		try {
			String serverIp="172.30.1.250";
			
			System.out.println("서버에 연결중입니다. 서버 IP :"+ serverIp);
			Socket socket = new Socket(serverIp, 7777);
			
			InputStream in= socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로부터 받은 메세지:"+dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
