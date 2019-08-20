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
            System.setProperty("java.rmi.server.hostname", "192.168.86.10");
            LocateRegistry.createRegistry(1099);
            Calculadora c = new CalculadoraImple();
            Naming.bind("CalculadoraService", (Remote) c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new CalculadoraServer();
    }
}
