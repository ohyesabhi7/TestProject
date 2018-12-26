import java.util.Scanner;

public class DemoJava {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//int i=sc.nextInt();
	//System.out.println("sdsf "+i);
	System.out.println("print to test on git hub");
	StringBuffer sb= new StringBuffer("abhijit");
	sb.append("yyyy");
	System.out.println(sb);
	System.out.println(sb);
	System.out.println(sb.append("sfS"));
	System.out.println(sb.substring(2,5));
	System.out.println(sb.replace(2, 4, "abcdey"));
	sb.reverse();
	//sb=sb+'d';
	System.out.println(sb);
	System.out.println(sb.lastIndexOf("ba"));
	
	String s=new String("Abhijit");
	s = s.concat("yyyy");
	System.out.println(s.indexOf('h'));
	System.out.println(s);
	String news="";
	
	
	for(int i=s.length()-1;i>=0;i--)
		news=news+s.charAt(i);
	System.out.println(news);
	
}
}
