import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author caiovosilva
 */
public interface Calculadora extends Remote {
    public long add(long a, long b) throws RemoteException;
}
