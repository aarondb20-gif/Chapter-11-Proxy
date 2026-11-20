import java.rmi.RemoteException;

public class RemoteMediaProxy implements MediaItemInterface{
    MediaItemInterface media;
    private boolean isConnected;

    public RemoteMediaProxy(MediaItemInterface media, boolean isConnected){
        this.media = media;
        this.isConnected = isConnected;
    }
    private void ensureConnected() throws RemoteException {
        if (media == null) {
            throw new RemoteException("Remote media reference is missing.");
        }
        if (!isConnected) {
            // Logic to establish connection goes here
            isConnected = true;
        }
    }

    @Override
    public String getTitle() throws RemoteException {
        ensureConnected();
        return media.getTitle();
    }

    @Override
    public int getDuration() throws RemoteException {
        ensureConnected();
        return media.getDuration();
    }

    @Override
    public void play() throws RemoteException {
        ensureConnected();
        media.play();
    }
}
