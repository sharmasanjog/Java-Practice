package Network.Rmi.Server;

import Network.Rmi.Interface.CommonInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws Exception {
        Example obj = new Example();
        Registry reg = LocateRegistry.createRegistry(5001);
        reg.bind("Example", obj);
        System.out.println("Server is running on port 5001 and object 'Example' is bound.");
    }
}
