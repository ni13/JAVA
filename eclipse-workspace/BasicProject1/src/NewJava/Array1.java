package NewJava;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {1,2,3,4,5,6};
String[] fruits= {"apple","mango","banana","grape"};
System.out.println("Need to print grape:"+fruits[3]);
System.out.println("Need to print: "+num[3]);

//one D-array
//shopping car
double[] productprice= {100.20,20.20,30.5,55.6};
double totalprice=productprice[0]+productprice[2]+productprice[3];
System.out.println("Total Price:"+totalprice);

//Student marks
int[] marks= {65,78,89,89};
int totalMarks=+marks[0]+marks[1]+marks[2]+marks[3];
System.out.println("Total Marks:"+totalMarks);
int average= totalMarks/(marks.length);
System.out.println("average:"+average);

//two D-array
int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
System.out.println(matrix[0][0]+ " " +matrix[0][1]+" "+matrix[0][2]);
System.out.println(matrix[0][0]+ " " +matrix[1][1]+" "+matrix[1][2]);
System.out.println(matrix[0][0]+ " " +matrix[2][1]+" "+matrix[2][2]);

// Ticket Booking-Bookmyshow
String[][] seats= {
		{"Available","Booked","Available"},
		{"Booked","Booked","Available"},
		{"Available","Booked","Booked"},
		};
System.out.println(seats[0][0]);
System.out.println(seats[1][1]);

//clone array

int[] orgArray= {10,20,30,40};
int[] cloneArray=orgArray.clone();
System.out.println("org:"+Arrays.toString(orgArray));
System.out.println("clone:"+Arrays.toString(cloneArray));
	}
}
	


