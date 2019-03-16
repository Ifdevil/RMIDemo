import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImpl implements Service {
    public ServiceImpl() throws RemoteException {
        super();
    }
    public String getUserName() throws RemoteException{
        User user = new User("那谱中");

        return "Hello!"+user.getName();
    }

    public User getUser() throws RemoteException {
        return new User("那谱中");
    }

    public static void main(String[] args) {

        try {
            String name = "Service";
            Service service = new ServiceImpl();
            Service stub = (Service) UnicastRemoteObject.exportObject(service,0);
            Registry registry = LocateRegistry.createRegistry(1002);
            registry.bind(name,stub);
            System.out.println("ServiceImpl bound");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
