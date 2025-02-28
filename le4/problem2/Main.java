/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Singleton {
	private static Singleton uniqueInstance;
	private Singleton() {
		System.out.println("Instance created");
	}
	public static Singleton getInstance()
	{
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
		else {
			System.out.println("can not create Instance");
		}
		return uniqueInstance;
	}
}
public class Main
{
	public static void main(String[] args) {
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		Singleton ob3 = Singleton.getInstance();
	}
}