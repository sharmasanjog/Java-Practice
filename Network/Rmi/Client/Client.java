package Network.Rmi.Client;

import Network.Rmi.Interface.CommonInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Registry reg = LocateRegistry.getRegistry("localhost", 5001);
        CommonInterface stub = (CommonInterface) reg.lookup("Example");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int a = scan.nextInt();
        System.out.println("Enter another Num:");
        int b = scan.nextInt();

        System.out.println("Output : " + stub.checkSend(a, b));
        scan.close();
    }
}
