import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws RemoteException {
        RealMedia song1 = new RealMedia("Happy Birthday", 200);
        RemoteMediaProxy remProxy = new RemoteMediaProxy(song1,true);
        System.out.println("Title: " + remProxy.getTitle());
        System.out.println("Duration: " + remProxy.getDuration() + "seconds");
        remProxy.play();

    }
}
