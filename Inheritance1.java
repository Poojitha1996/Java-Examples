class teacher{
	void teaching() {System.out.println("teaches");}
}
class assistant extends teacher{
	void help() { System.out.println("helping");}
}
class leader extends teacher{
	void informs() {System.out.println("informs");}
}
class Inheritance1 {

	public static void main(String args[]){
	
		leader L= new leader();
		L.informs();
		L.teaching();
		L.teaching();
	}
}


