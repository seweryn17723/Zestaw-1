public class VideoPlayer implements Main.MediaPlayer{
    @Override
    public void play(String trackName){
        System.out.println("Odtwarzanie video: " + trackName);
    }

    @Override
    public void pause(){
        System.out.println("Wstrzymano oglądanie video");
    }

    @Override
    public String getCurrentTrack(){
        return "Video";
    }
}
