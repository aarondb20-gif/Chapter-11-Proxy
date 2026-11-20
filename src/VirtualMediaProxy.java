
import java.rmi.RemoteException;


public class VirtualMediaProxy implements MediaItemInterface{
    private RealMedia realMedia = null;
    private String title;
    private int duration;

    public VirtualMediaProxy(String title, int duration){
        this.title = title;
        this.duration = duration;
    }
    //Lazy loading
    private void mediaInitialized(){
        if(realMedia == null){
            System.out.println("Loading heavy assets into memory...");
            realMedia = new RealMedia(this.title, this.duration);
        }

    }
    @Override
    public String getTitle() throws RemoteException {
        return this.getTitle();
    }

    @Override
    public int getDuration() throws RemoteException {
        return this.getDuration();

    }

    @Override
    public void play() throws RemoteException {
            mediaInitialized();
            realMedia.play();

    }
}
