package Ex3numb8;

public class Kettle {
	protected String name;
	protected int volume;
	protected boolean state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getVol() {
		return volume;
	}

	public void setVol(int volume) {
		this.volume = volume;
		}
	
	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
				}
	
	 public void display(){
		 String st;
		 if(state) {
				st = " is ON";
			}else {
				st = " is OFF";
			}
       System.out.printf("Kettle " +  name + " volume " +  volume + " state" + st );
	    }
}
