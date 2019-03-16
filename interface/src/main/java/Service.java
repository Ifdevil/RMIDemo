import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {

    public String getUserName() throws RemoteException;

    public User getUser() throws RemoteException;

}