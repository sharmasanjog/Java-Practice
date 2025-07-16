package Network.Palindrome;

import java.net.*;
import java.io.*;
import java.util.*;

class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5001);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your message to check whether it is palindrome or not ");
            String msg = scan.next();
            dos.writeUTF(msg);
            if (msg.equalsIgnoreCase("Byee")) {
                break;
            }
            String reply=dis.readUTF();
            System.out.println("Server Response: " + reply);
        }

        dos.close();
        dis.close();
        s.close();
    }
}