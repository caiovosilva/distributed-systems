import java.rmi.Naming;

/**
 *
 * @author caiovosilva
 */
public class CalculadoraClient {
    public static void main(String [] args) {
        try {
            ICalculadora c = (ICalculadora) Naming.lookup("rmi://200.128.35.125:1099/CalculadoraService");
            System.out.println("Adicao: " + c.add(10, 15));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
