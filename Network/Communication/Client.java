package Network.Communication;

import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 5001);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("hello sir ");
        System.out.println("Reply from server : " + dis.readUTF());
        dos.close();
        dis.close();
        s.close();
    
    }
}