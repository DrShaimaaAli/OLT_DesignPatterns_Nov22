package Interperter;

public class SequenceExpression extends RegularExpression{
	private RegularExpression experssion1;
	private RegularExpression experssion2;
	
	
	public  boolean isMatch(String toMatch)
	{
		return
			experssion1.isMatch(toMatch)
			&&
			experssion2.isMatch(toMatch); // add the logic to check the order
	}


	public RegularExpression getExperssion1() {
		return experssion1;
	}


	public void setExperssion1(RegularExpression experssion1) {
		this.experssion1 = experssion1;
	}


	public RegularExpression getExperssion2() {
		return experssion2;
	}


	public void setExperssion2(RegularExpression experssion2) {
		this.experssion2 = experssion2;
	}
}
