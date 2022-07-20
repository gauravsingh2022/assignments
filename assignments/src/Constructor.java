class EmpInfo
{
	int id;
	String name;
	
	
	EmpInfo(int i,String n)
	{
		id = i;
		name = n;
	}
void display() 
	{
	System.out.println(id+" "+name);

	}
}

public class Constructor {

public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo(11,"Gaurav");
	EmpInfo emp2=new EmpInfo(7, "paras");

	emp1.display();
	emp2.display();
	}
}
