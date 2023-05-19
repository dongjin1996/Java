package ch19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class NewsClient {

	public static void main(String[] args) {
		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			
			//서버에게 데이터를 보내준다.
			String data = "정치";
			byte[] bytes = data.getBytes("UTF-8");
			
			DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localhost", 50001));
			datagramSocket.send(sendPacket);
			
			while(true) {
				//뉴스를 받는다.
				DatagramPacket recievePacket = new DatagramPacket(new byte[1024], 1024);
				datagramSocket.receive(recievePacket);
				
				//문자열 변환
				String news = new String(recievePacket.getData(), 0, recievePacket.getLength(), "UTF-8");
				System.out.println(news);
				
				//10번째 뉴스를 받으면 while문 종료
				if(news.contains("뉴스10")) { //뉴스 10 글자가 포함되어 있는지
					break;
				}
			}
			
			datagramSocket.close(); //소켓닫기
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
