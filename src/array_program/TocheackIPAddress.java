package array_program;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TocheackIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("enter website");
          String website = sc.nextLine();
         try {
			InetAddress ip =InetAddress.getByName(website);
			System.out.println("iP ADDRESS FOR GIVEN WEBSITE IS="+ip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not found");
		}
	}

}
