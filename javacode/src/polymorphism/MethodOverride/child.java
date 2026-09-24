package polymorphism.MethodOverride;

public class child extends parent {
	@Override
	protected boolean login(String uname, String pwd) {
		boolean status=false;
		if(uname==uname && pwd==pwd)
		{
			status=true;
			System.out.println("Child Login successfull");
		}
		return status ;
	}

}
