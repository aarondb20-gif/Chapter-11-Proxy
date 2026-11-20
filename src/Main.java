import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws RemoteException {
       RealMedia song0 = new RealMedia("Happy Birthday", 200);
       RealMedia song1 = new RealMedia("Feliz Navidad", 240);
       //Remote proxy test
       RemoteMediaProxy remProxy = new RemoteMediaProxy(song0,true);
       RemoteMediaProxy remProxy2 = new RemoteMediaProxy(song1,true);
       remProxy.play();
       remProxy2.play();
        System.out.println();
        //Virtual Proxy test
        VirtualMediaProxy vmProxy0 = new VirtualMediaProxy("La Cucaracha", 300);
        VirtualMediaProxy vmProxy1 = new VirtualMediaProxy("Feliz Navidad", 240);
        vmProxy0.play();
        vmProxy1.play();
        System.out.println("Title method: " + vmProxy0.getTitle() + " Duration method: " + vmProxy0.getDuration());





    }
}
