import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Consumer {

    public static void main(String[] args) {
        try {
            String name = "Service";
            Registry registry = LocateRegistry.getRegistry(1002);
            Service service = (Service) registry.lookup(name);
            System.out.println(service.getUserName());
            System.out.println(service.getUser().getName());
        } catch (Exception e) {
            System.err.println("Service exception:");
            e.printStackTrace();
        }
    }
}
