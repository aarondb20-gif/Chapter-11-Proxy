import java.rmi.RemoteException;

public class RemoteMediaProxy implements MediaItemInterface{
    MediaItemInterface media;
    private boolean isConnected;

    public RemoteMediaProxy(MediaItemInterface media, boolean isConnected){
        this.media = media;
        this.isConnected = isConnected;
    }

    @Override
    public String getTitle() throws RemoteException {
        if(isConnected == true) {
            return media.getTitle();
        }else{
            isConnected = true;
            return "Not Connected...Connecting...";


        }
    }

    @Override
    public int getDuration() throws RemoteException {
        if(isConnected == true) {
            return media.getDuration();
        }else{
            isConnected = true;
            return 0;
        }
    }

    @Override
    public void play() throws RemoteException {
        if(isConnected == true){
            media.play();
        }else{
            System.out.println("Not Connected...Connecting...");
            isConnected = true;
        }


    }
}
