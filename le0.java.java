/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Me
{
    int age;
	String name;
	public void setNumber(int Number){
	    age = Number;
	}
	public int getNumber(){
	    return age;
	}
	public void setName( String newname){
		this.name = newname;
	}
	public String getName(){
	    return name;
	}
}
class Main{
    public static void main(String[] args) {
        Me obj = new Me();
        obj.setName("xxx");
        obj.setNumber(21);
        System.out.println(obj.getName());
        System.out.println(obj.getNumber());
    }
}