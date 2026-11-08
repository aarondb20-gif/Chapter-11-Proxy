import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws RemoteException {
       RealMedia song0 = new RealMedia("Happy Birthday", 200);
       RealMedia song1 = new RealMedia("Feliz Navidad", 240);
       RemoteMediaProxy remProxy = new RemoteMediaProxy(song0,true);
       RemoteMediaProxy remProxy2 = new RemoteMediaProxy(song1,true);
        remProxy.play();
        remProxy2.play();

        VirtualMediaProxy vmProxy0 = new VirtualMediaProxy("La Cucaracha", 300);
        VirtualMediaProxy vmProxy1 = new VirtualMediaProxy(song0.getTitle(), song0.getDuration());
        vmProxy0.play();
        vmProxy1.play();




    }
}
