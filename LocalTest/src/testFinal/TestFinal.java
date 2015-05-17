package testFinal;

class TestFinal {

	final String str;
	
	public TestFinal(String str) {
		this.str = str;
		setStr("BBB");
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr () {
		return this.str;
	}
	
	public static void main(String[] args) {
		new TestFinal("AAA");
	}

}
