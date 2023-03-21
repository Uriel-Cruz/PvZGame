public class PlayAudio implements Runnable{

	String music_file;

	public PlayAudio(String music_file){
		this.music_file = music_file;
	}

	@Override public void run(){
			new AudioFilePlayer(music_file);
	}

	//public void Cancel(){
      //interrupt();
   //}
	
}