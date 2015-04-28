package inclass02;

public class Boy {

	int girlfriends;
	double weight;
	double height;
	int age;
	String name;

	public Boy() {
		girlfriends = 10;
		weight = 60.0;
		height = 180.0;
		age = 19;
		String name = "Jack";
	}

	public Boy(String name, int age, double height, double weight, int numOfGirfriends){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.girlfriends = numOfGirfriends;
	}
	
	public void eat() {
		System.out.println(name + " has a meal.");
	}
	
	public void sleep() {
		System.out.println(name + " starts to sleep.");
	}
	
	public void programming() {
		System.out.println(name + " begins programming.");
	}
	
	public void callName(String name) {
		if (name == this.name) {
			System.out.println("Hello.");
		} else {
			System.err.println("You call the wrong name!");
		}
	}
	
	public void updateAge(int age) {
		this.age = age;
	}

	public void girlfriend(boolean isBreak) {
		if (isBreak) {
			if (this.girlfriends>0) {
				this.girlfriends--;
				System.out.println(name + " lost a grilfriend.");
			} else {
				System.err.println(name + " has no grilfriend now.\nit's impossible to break off with a grilfriend.");
			}
		}
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
