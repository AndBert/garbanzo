package Ex3numb8;

public class Radio {
	protected String name;
	protected int volume;
	protected int channel;
	protected String ch;
	protected int state;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 public void display(){
		System.out.printf("Radio " + name );
	}
	 
	 public int getChan() {
		return channel;
	}
	 
	 public void setChan(int channel) {
		
		switch (channel) {
			case 1 : ch = "You heard EuropaPlus";
			break;
			case 2 : ch = "You heard RadioBA";
			break;
			case 3 : ch = "You heard Unistar";
			break;
			default: break;
		}
		System.out.println(ch);
		this.channel = channel;
	}

	 public int getVol() {
		return volume;
	}
	 
	 public void setVol(int volume) {
		this.volume = volume;
		if(volume < 5) {
			System.out.println("\r\n" + "The radio sounds very quiet");
		}else {
			System.out.println("\r\n" + "The radio sounds very loud");
		}
	}
}



