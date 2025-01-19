public class AudioPlayer implements Main.MediaPlayer {
    @Override
    public void play(String trackName){
        System.out.println("Odtwarzanie utworu: " + trackName);
    }

    @Override
    public void pause(){
        System.out.println("Wstrzymano odtwarzanie audio");
    }

    @Override
    public String getCurrentTrack(){
        return "Audio";
    }
}

//implements MediaPlayer