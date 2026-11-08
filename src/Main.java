import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws RemoteException {
       // RealMedia song1 = new RealMedia("Happy Birthday", 200);
       // RemoteMediaProxy remProxy = new RemoteMediaProxy(song1,true);

        //remProxy.play();

        VirtualMediaProxy vmProxy = new VirtualMediaProxy("La Cucaracha", 300);
        vmProxy.play();




    }
}
