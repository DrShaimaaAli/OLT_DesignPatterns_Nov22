package Bridge;

public class TestDriver {
	
	public static void powerLights_Client(PowerSwitch power)
	{
		// logic
		power.powerOn();
		
		power.powerOff();
	}
	
	public static void configureLights(PowerSwitch power, SectionedLights lights )
	{
		power.setLights(lights);
		powerLights_Client(power);
	}
	
	public static void main(String[] args) {
		
		// regualr lights, with regular power
		//PowerSwitch power = new PowerSwitch();
		//RegularSectionedLights lights = new RegularSectionedLights();
		configureLights(new PowerSwitch(), new RegularSectionedLights());
		
		System.out.println("=================================================");
		//regular lights, with timed power
		configureLights(new TimedPowerSwitch(), new RegularSectionedLights());
		
		System.out.println("##########################################");
		
		//AlternatingSectionedLights lights = new RegularSectionedLights();
		configureLights(new PowerSwitch(), new AlternatingSectionLights());
				
		System.out.println("=================================================");
		//regular lights, with timed power
		configureLights(new TimedPowerSwitch(), new AlternatingSectionLights());
		
	}

}
