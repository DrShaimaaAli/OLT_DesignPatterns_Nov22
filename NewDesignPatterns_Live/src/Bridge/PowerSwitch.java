package Bridge;

public  class PowerSwitch {

	private SectionedLights lights;
	
	public void powerOn() {
		lights.sectionedLightsOn();
	}
	public void powerOff() {
		lights.sectionedLightsOff();
	}
	
	public SectionedLights getLights() {
		return lights;
	}
	public void setLights(SectionedLights lights) {
		this.lights = lights;
	}
}
