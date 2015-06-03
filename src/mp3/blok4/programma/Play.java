package mp3.blok4.programma;

public class Play {
	private boolean btnPlay;
	private boolean btnStop;
	private boolean btnNext;
	private boolean btnPrev;
	private boolean btnPower;
	private boolean btnShuffle;
	private boolean btnRepeat;
	private boolean btnBass;

	public void play() {
		//start timer
		//speel muziek af in geselecteerde orde

	}

	public void pauze() {
		//terwijl er niet op het play/doorspoel/terugspoel/power/power save
		//knop wordt gedrukt
		//zet muziek op pauze
	}

	public void stop() {
		//stopt met afspelen (pauzeren)
		//reset
	}

	public void next() {
		//als de knop een keer (of meerdere keren) wordt ingedrukt binnen 1 s
			//tel aantal keren ingedrukt
			//reset timer
			//speel volgende nummer af (afhankelijk van aantal keren dat op de knop wordt ingedrukt)
		//als de knop langer dan 2 s wordt ingedrukt
			//spoel muziek door
	}

	public void previous() {
		
		//als de knop een keer wordt ingedrukt binnen 1 s
			//speel hetzelfde nummer af
			//reset timer
		//anders als er meerdere keren wordt gedrukt binnen 1 s
			//tel aantal keren ingedrukt
			//reset timer
			//speel vorige nummer af (afhankelijk van aantal keren dat op de knop wordt ingedrukt)
		//als de knop langer dan 2 s wordt ingedrukt
			//spoel muziek achteruit
	}

	public void powerOn() {
		//zet leds aan
		//laat start op scherm zien
	}

	public void powerOff() {
		//leds uit
		//state9
	}
	
	public void shuffle() {
		//zet muzieklijst in willekeurige volgorde
		//speel de muzieklijst af wanneer actuele nummer af is
	}
	
	public void repeat() {
		//herhaal actuele nummer constant
		//als de knop voor de tweede keer wordt ingedrukt
			//herhaal de hele lijst
	}

	public void BassBoost() {
		//bassboost aan
	}

	public void volumeUp() {
		//verhoog volume
	}

	public void volumeDown() {
		//verlaag volume
	}

}
