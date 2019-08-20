import java.rmi.Naming;

/**
 *
 * @author caiovosilva
 */
public class CalculadoraClient {
    public static void main(String [] args) {
        try {
            Calculadora c = (Calculadora) Naming.lookup("rmi://192.168.86.10:1099/CalculadoraService");
            System.out.println("Adicao: " + c.add(10, 15));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
