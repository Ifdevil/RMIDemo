import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Consumer {

    public static void main(String[] args) {
        try {
            String name = "Service";
            Registry registry = LocateRegistry.getRegistry(1002);//获取本地注册中心
            Service service = (Service) registry.lookup(name);//寻找服务
            System.out.println(service.getUserName());
            System.out.println(service.getUser().getName());
        } catch (Exception e) {
            System.err.println("Service exception:");
            e.printStackTrace();
        }
    }
}
