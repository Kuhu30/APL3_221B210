
public class ConcreteTest extends AbsTest {
    
    public void display() {
        System.out.println("This is the display method in ConcreteTest class.");
    }

    public static void main(String[] args) {
        ConcreteTest concreteTest = new ConcreteTest();
   
        concreteTest.display();
    }
}
