package Bridge;

public class TimedPowerSwitch extends PowerSwitch {

	public void configureTime() {}
	
	public void powerOn() {
		System.out.println("Time to Turn on! ");
		// logic for turning the power on
		super.powerOn();
	}
	public  void powerOff() {
		System.out.println("Time to Turn off! ");
		// logic for turning the power off
		super.powerOff();
	}

}
