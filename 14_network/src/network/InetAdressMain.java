package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressMain {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println("Naver IP = " + naver.getHostAddress());
		System.out.println();
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("localhost IP = " + local.getHostAddress());
		System.out.println();
		
		InetAddress[] naver2 = InetAddress.getAllByName("www.naver.com");
		for(InetAddress data : naver2) {
			System.out.println("Daum IP = " + data.getHostAddress());
			
		}

	}

}
