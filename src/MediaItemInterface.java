import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MediaItemInterface extends Remote {
    String getTitle() throws RemoteException;
    int getDuration() throws RemoteException;
    void play() throws RemoteException;
}
