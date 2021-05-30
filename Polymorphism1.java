class Apartment{
	int num;
	String location;
	Apartment(int num,String location){
		this.num=num;
		this.location=location;
	}
}
class Home extends Apartment {
	float rent;
	Home(int num,String location,float rent)
	{
		super(num,location);
		this.rent=rent;
	}
	void display() {System.out.println(num+" "+location+" "+rent);
}
class Polymorphism1{
public void main(String[]args)
	{
		Home H=new Home(25,"Prashanthnagar",450);
H.display();
	}
}
}