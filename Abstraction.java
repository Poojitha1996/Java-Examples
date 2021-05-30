interface Table{
	void chair();
	void sofa();
	void desk();
	void stand();
}
abstract class Furniture implements Table
{
	public void sofa() 
	{
		System.out.println("Sit on sofa");
}
}
class Patio extends Furniture
{
	public void chair(){System.out.println("Sit on chair");}
	public void desk(){System.out.println("Sit on desk");}
	public void stand(){System.out.println("Sit on stand");}
	
}
public class Abstraction {
	public static void main(String[]args) {
		Table t= new Patio();
		t.chair();
		t.sofa();
		t.desk();
		t.stand();	
	}
}
