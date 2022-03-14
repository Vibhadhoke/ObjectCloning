package ObjectCloning;

public class DeepCloning  {

//	public static void main(String[] args)throws CloneNotSupportedException {
public ststic void main(String[]args)throws CloneNotSupportedExecption{
Address add= new Address("PUNE","IND",123);

Student s1= new Student(10,"Ram",add);
System.out.println("Original(s1)=" +s1);

Student s2= (Student)s1.clone();
System.out.println("Cloned(s2)=" +s2);

s1.add.city ="Mumbai";

System.out.println("Original(s1)after change=" =s1);
System.out.println("Original(s2)after change=" =s2);

System.out.println("s1 hashcode=" +s1.hashcode()+  "s1.Address hashcode="s1.add.hashCode());
System.out.println("s2 hashcode=" +s2.hashcode()+  "s2.Address hashcode="s2.add.hashCode());

}
}	
	
			
		
	