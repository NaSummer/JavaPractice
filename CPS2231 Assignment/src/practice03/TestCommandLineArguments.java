package practice03;

class TestCommandLineArguments {

	public static void main(String[] args) {
//		args[0] = "do you like our WKU?";
		Title test = new Title(args[0]);
		System.out.println(test.title);
	}

}
