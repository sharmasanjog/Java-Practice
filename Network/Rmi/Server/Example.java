package Network.Rmi.Server;

import Network.Rmi.Interface.CommonInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Example extends UnicastRemoteObject implements CommonInterface {
    public Example() throws RemoteException {
        super();
    }

    public int checkSend(int a, int b) throws RemoteException {
        return a + b;  // Simple addition, can be changed
    }
}
