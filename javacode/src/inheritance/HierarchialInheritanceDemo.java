package inheritance;

import java.util.Scanner;

public class HierarchialInheritanceDemo {
	public static void main(String[] args) {
		Person p;
		
      Address ad=new Address("MG Road","Mysore","Karnataka",570028);
      System.out.println(ad);
     p=new Employee("Gowri","Mysore",ad,200,50000,1);
      System.out.println(p);
      
     
	}
}
