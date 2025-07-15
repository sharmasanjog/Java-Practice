package Network.Communication;

import java.net.*;

import java.io.*;

class Server{
    public static void main(String[]args)throws Exception{
ServerSocket ss=new ServerSocket(5001);
System.out.println("Server running on port 5001");
Socket s=ss.accept();
System.out.println("Client connected");
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());

String msg=dis.readUTF();
dos.writeUTF(msg.toUpperCase());
dos.close();
dis.close();
s.close();
ss.close();




    }
    
}

