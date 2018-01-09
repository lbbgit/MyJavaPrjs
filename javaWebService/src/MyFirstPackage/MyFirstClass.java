package MyFirstPackage;

//must write this right
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService 
public class MyFirstClass {
	public MyFirstClass(){}
	public String w1(){
		return "hwello,java wordl!";
	}
	public String w2(String name){
		return "hwello,java "+name;
	}
	
	public String w3(String[] name){
		if(name==null ||  name.length==0)
			name=new String[]{"haha,empty!"}; 
		return "hwello,java "+name[0];
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ok runing!");
		MyFirstClass a=new MyFirstClass();
		Endpoint.publish("http://localhost:9000/Service/MyFirstClass", a); 
		System.out.print("ok project 1!");
			Endpoint.publish("http://localhost:9000/Service/1", new MyFirstClass());
			Endpoint.publish("http://localhost:9000/w", a);
			System.out.print("ok @project all!");
	}

}
