/** ik kan het object input niet gebruiken en als ik getters en setters aanmaak veranderd hij dat in is .....  **/

package mp3.blok4.programma;

class Gpio {
	/* Native methods declaration */
	private boolean on = input.geton();
	
	
	
	public native int ioinit();

	public native int iodeinit();

	public native int iowrite(int a, int v);

	public native int ioread(int a);
	
	//private Input input;
	/** wijzig **/
	
	public Gpio() {/** wijzig **/
		Input input = new Input(); /** waarom vind ik die input class niet  **/
	}

	// Use static intializer
	static {
		try {
			System.loadLibrary("gpio"); /** wijzig  werkt zo wel**/ //werkt niet 
		}catch (UnsatisfiedLinkError e) {
			      System.err.println("Native code library failed to load.\n" + e);
			      System.exit(1);
		}
	}
	
	public static void main(String[] args) {
		Gpio io = new Gpio();
		io.ioinit(); // Initialize GPIO lines
		
		while(input.geton == true){
			//main function dingen
		}
		
		
//		for (int i = 0; i < 200000; i++) {
//			io.iowrite(80, 1); // Make output PB16 high
//			io.iowrite(80, 0); // Make output PB16 low
//			// Read status of input PB30
//			System.out.println("PB30: " + io.ioread(94));
//		}// for
		io.iodeinit(); // Deinitialize GPIO lines
	}
	
	public void play() {
		while(){
			
		}
	}
}