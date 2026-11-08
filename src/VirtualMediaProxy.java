import javax.xml.transform.Source;
import java.rmi.RemoteException;
import java.sql.SQLOutput;

public class VirtualMediaProxy implements MediaItemInterface{
    RealMedia realMedia = null;
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
        if(realMedia == null) {
            mediaInitialized();
        }
        return realMedia.getTitle();
    }

    @Override
    public int getDuration() throws RemoteException {
        if (realMedia == null) {
            mediaInitialized();
        }
        return realMedia.getDuration();

    }

    @Override
    public void play() throws RemoteException {
            mediaInitialized();
            realMedia.play();

    }
}
