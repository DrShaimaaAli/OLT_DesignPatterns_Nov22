package Interperter;

public class LiteralExpression extends RegularExpression{
	private String literal;
	
	public  boolean isMatch(String toMatch)
	{
		return toMatch.contains(literal);
	}

	public String getLiteral() {
		return literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}
}
