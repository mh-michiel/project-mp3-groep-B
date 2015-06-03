package mp3.blok4.programma;

public class Input {
	private String inputString;
	
	private boolean playMusic;
	private boolean forwardFlush;
	private boolean backward;
	private boolean on;
	private boolean stop;
	
	public short convertInput() {
		//Zet input om in een functionele short (binaire, hex ...)
		return 1;
	}
	
	public String getInputString() {
		return inputString;
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}

	public boolean getplayMusic() {
		return playMusic;
	}

	public void setplayMusic(boolean playMusic) {
		this.playMusic = playMusic;
	}

	public boolean getforwardFlush() {
		return forwardFlush;
	}

	public void setforwardFlush(boolean forwardFlush) {
		this.forwardFlush = forwardFlush;
	}

	public boolean getbackward() {
		return backward;
	}

	public void setbackward(boolean backward) {
		this.backward = backward;
	}

	public boolean geton() {
		return on;
	}

	public void seton(boolean on) {
		this.on = on;
	}

	public boolean getstop() {
		return stop;
	}

	public void setstop(boolean stop) {
		this.stop = stop;
	}

	

}
