package enlisted;
 
public class enlisted
{
 
public String name;
 
private int marks;
 
public enlisted (String stuName) {
name = stuName;
}
public void setMarks(int stuMar) {
marks = stuMar;
}
 
// This method prints the student details.
public void printStu() {
System.out.println("Name: " + name );
System.out.println("Marks:" + marks);
}
 
public static void main(String args[]) {
enlisted StuOne = new enlisted("Liu");
enlisted StuTwo = new enlisted("Lorwin");
enlisted StuThree = new enlisted("Del Barrio");
 
StuOne.setMarks(85);
StuTwo.setMarks(89);
StuThree.setMarks(85);
 
StuOne.printStu();
StuTwo.printStu();
StuThree.printStu();
 
}
}