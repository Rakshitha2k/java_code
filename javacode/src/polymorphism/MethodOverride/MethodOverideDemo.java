package polymorphism.MethodOverride;

public class MethodOverideDemo {
	public static void main(String[] args) {
		parent p=new parent();
		p.login("Gayatri", "123");
        p=new child();
        p.login("David", "xyz");
	}


}
