package mp3.blok4.programma;

public class LCDOutput {
	private short output;
	private File file;
	private Volume volume;
	
	public void setOutput() {
		//zorgt ervoor dat de relevante informatie op juiste momenten naar LCD scherm gestuurd word
		//vb. tijdens afsplelen = artiest, length, title
		//vb tijdens volume wijziging = volumeniveau
		//enz
	}
	
	public File readFile() {
		//haalt huidige song info op uit klasse file
	}
	
	public void setArtist() {
		//haalt juiste info uit readFile en zet deze om naar uitgangssignaal voor lcd
	}
	
	public void setTitle() {
		//haalt juiste info uit readFile en zet deze  om naar uitgangssignaal voor lcd
	}
	
	public void setLength() {
		//haalt juiste info uit readFile en zet deze om naar uitgangssignaal voor lcd
	}
	
	public void setVolume() {
		//haalt juiste info uit volume en zet deze om naar uitgangssignaal voor lcd
	}

}
