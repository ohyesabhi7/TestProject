package inheritence;

public class Child extends Parent{
	
void m3()
{
	System.out.println("indi from child");
}

void m2()
{
	//super.m2();
	System.out.println("common from child");
}

public static void main(String[] args) {
Parent p=new Child();

//p.m1();
//p.m2();
//p.m3();


Child c=new Child();
c.m1();
c.m2();
c.m3();
}
}
