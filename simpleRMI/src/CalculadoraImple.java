import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author caiovosilva
 */
public class CalculadoraImple extends UnicastRemoteObject implements ICalculadora {
    private static final long serialVersionUID = 1L;
    
    protected CalculadoraImple() throws RemoteException {
        super();
    }
    @Override
    public long add(long a, long b) throws RemoteException {
        return a+b;
    }
    
}
