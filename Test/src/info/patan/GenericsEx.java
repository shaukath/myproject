package info.patan;


public class GenericsEx {
	public static void main(String[] args) {
		
		Integer i = 40;
	MyCass<Integer> myClass = new MyCass<Integer>(i);
	System.out.println(myClass.getObj());
	MyCass<String> myString = new MyCass<String>("456ALI");
	System.out.println(myString.getObj());
	System.out.println("Hi");

	}

}
class MyCass<T>{
	T obj;
public MyCass(T obj) {
	this.obj = obj;
	// TODO Auto-generated constructor stub
}
T getObj(){
	return obj;
}
}