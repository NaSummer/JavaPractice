import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URI;
import java.net.URL;

public class music extends Thread{
	public void run (){
		try {
//			File musicFile = new File("bad.wav");
//			URI uri = musicFile.toURI();
//			URL url = uri.toURL();
//			AudioClip clip=Applet.newAudioClip(url);
//			clip.play();
			new AudioOperation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public class AudioOperation extends Applet{
	    AudioClip audioClip;
	     public AudioOperation(){
	        try{
	            audioClip=Applet.newAudioClip(new URL("file:///d:/Data/JavaWorkspace-old/start/bad.wav"));
	            audioClip.play();
	            //audioClip.play();
	        }catch(Exception e){
	            System.out.println("Error:AudioOperation!"+e);
	        }
	    }
//	    public static void main(String[] args){
//	        System.out.println("Program is working........");
//			new AudioOperation();
//	        System.out.println("Program is over!");
//	    }
	}
}