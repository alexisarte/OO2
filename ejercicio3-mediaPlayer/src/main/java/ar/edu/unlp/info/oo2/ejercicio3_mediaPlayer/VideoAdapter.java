package ar.edu.unlp.info.oo2.ejercicio3_mediaPlayer;

public class VideoAdapter extends Media {
	
	private VideoStream stream = new VideoStream();
	
	@Override
	public void play() {
		this.stream.reproduce();
	}
	
}
