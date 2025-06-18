package NewJava;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=3;
int num1=10;

//Arithmetic operators
System.out.println("Add:"+(a+b));
System.out.println("Sub:"+(a-b));
System.out.println("Multi:"+(a*b));
System.out.println("Div:"+(a/b));
System.out.println("Modulus:"+(a%b));

//shift operator 
//System.out.println("Left:"+(num1<<3));
System.out.println("Org:"+num1);
System.out.println("Left:"+(num1<<4));
//System.out.println("Right:"+(num1>>3));
System.out.println("Signed Right:"+(num1>>2));
System.out.println("Unsigned Right:"+(num1>>>2));

//Relational operators
System.out.println("Equalto:"+(a==b));
System.out.println("NotEqualto:"+(a!=b));
System.out.println("Greaterthan:"+(a>b));
System.out.println("Lesserthan:"+(a<b));
System.out.println("Greaterthan or Equalto:"+(a>=b));
System.out.println("Lesserthan or Equalto:"+(a<=b));

//Logical Operators-Binary value//
int x=155;
int y=10;
if(x>10 && y<30)
{
	System.out.println("Both is true");
	if(x<10 ||y>20)
	{
		System.out.println("at least one");
		if(!(x<10)) {
			System.out.println("x is not less than 10");
	}
}
}
//ternary operator-replacement of if else
int age=26;
String voting=(age>=18)?"you can vote":"you cannot vote";//if condition is true before: will be executed
System.out.println(voting);

// assignment - assigns the value to variable
int abc=10;
System.out.println(abc);
abc+=5;
System.out.println("value:"+abc);

abc-=3;
System.out.println("value:"+abc);

abc*=2;
System.out.println("value:"+abc);

abc/=4;
System.out.println("value:"+abc);

abc%=5;
System.out.println("value:"+abc);
	}

}
