package enlisted;

import java.util.*;

class Student {
	
	private final int studentNumber;
	private final Collection<Section> sections = new HashSet<>();
	
	Student(int studentNumber, Collection<Section> sections){
		if(studentNumber < 0) {
			throw new IllegalArgumentException("studentNumber should be non-negative, was " + studentNumber);
		}
		if (sections == null) {
			throw new NullPointerException("Section was null");
		}
		this.studentNumber = studentNumber;
		this.sections.addAll(sections);
	}
	Student(int studentNumber){
		this(studentNumber, Collections.emptyList());
	}

	void enlist(Section newSection) {
		if(newSection == null) {
			throw new NullPointerException("");
		}
		sections.forEach(currSection -> currSection.checkConflict(newSection));
		sections.add(newSection);
	}
	
	Collection<Section> getSections(){
		return new ArrayList<>(sections);
		
	}
	@Override
	public String toString() {
		return "Student #" + studentNumber;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentNumber != other.studentNumber)
			return false;
		return true;
	}
	public void notenlist(Section section604) {
		// TODO Auto-generated method stub
		
	}
	
	

}