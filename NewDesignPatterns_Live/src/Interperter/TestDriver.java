package Interperter;

public class TestDriver {
	public static void main(String[] args) {
		// a&b
		
		LiteralExpression exp1 = new LiteralExpression();
		exp1.setLiteral("a");
		LiteralExpression exp2 = new LiteralExpression();
		exp2.setLiteral("b");
		
		SequenceExpression seq = new SequenceExpression();
		seq.setExperssion1(exp1);
		seq.setExperssion2(exp2);
		
		System.out.println(seq.isMatch("123454abcdef"));
		System.out.println(seq.isMatch("123454acdef"));
		
	}
}
