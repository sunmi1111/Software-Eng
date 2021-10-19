public class instructor {
   
   private String section;
   private String instructor;
   private double number;

   // instructor
   public instructor(String t, String a, double p) {
      setSection(t.trim());
      setInstructor(a.trim());
      setNumber(p);
   }

public double getNumber() {
	return number;
}

public void setNumber(double number) {
	this.number = number;
}

public String getInstructor() {
	return instructor;
}

public void setInstructor(String instructor) {
	this.instructor = instructor;
}

public String getSection() {
	return section;
}

public void setSection(String section) {
	this.section = section;
}
}