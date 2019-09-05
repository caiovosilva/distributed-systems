import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author caiovosilva
 */
public class CalculadoraServer {

    public CalculadoraServer() {
        try {
            System.setProperty("java.rmi.server.hostname", "200.128.35.125");
            LocateRegistry.createRegistry(1099);
            ICalculadora c = new CalculadoraImple();
            Naming.bind("CalculadoraService", (Remote) c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new CalculadoraServer();
    }
}
