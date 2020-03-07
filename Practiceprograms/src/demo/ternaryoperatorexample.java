package demo;

public class ternaryoperatorexample {

	public static void main(String[] args) {
Object obj1;
Object obj2;
if(true)
	obj1= new Integer(15);
else
	obj1= new Double(25.0);
	System.out.println(obj1);
	obj2= true?new Integer(15):new Double(25.0);
	System.out.println(obj2);
	}

}
