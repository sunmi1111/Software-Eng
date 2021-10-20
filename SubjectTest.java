package enlisted;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubjectTest {
	
	//iteration2
	
	private Section section604;
	private int value;
	private int whatever_value;
	private int[] something_in_the_array;
	@Test
	void subjects_ID() {
		
		Subject subject1 = new Subject( "MAT", 1);
		Subject subject2 = new Subject( "SCI", 2);
		Subject subject3 = new Subject( "ENG", 3);
		
		assertAll(		
				() -> assertEquals( 1,subject1.getCapacity()),	
				() -> assertEquals( 2,subject2.getCapacity()),
				() -> assertEquals( 3,subject3.getCapacity())
				
		);
	}
	
	@Test
	void cannot_enlist_subjects() {
		
		//cannot enlist sections with the same subject
		int capacity = 1;
		new Room( "RM604", capacity);
		new Subject(Days.F, Period.H1130);
		Schedule sched604 = null;
		new Section("Mckinley", "MAT", sched604);
		
		Student stud1 = new Student(1);
		Student stud2 = new Student(2);
		
		stud1.enlist(section604);;
		
		assertThrows(RoomOverCapacityException.class, () -> stud2.enlist(section604));
	}
	@Test
	void prerequisite_subject() {
		
		//cannot enlist the subject if did'nt take a preq subs 
		switch (value) {
		  case 1:
		     for (int i = 0; i < something_in_the_array.length; i++)
		        if (whatever_value == (something_in_the_array[i])) {
		           value = 2;
		           break;
		        } else if (whatever_value == 2) {
		           value = 3;
		           break;
		        } else if (whatever_value == 3) {
		           value = 4;
		           break;
		        }
		     break;
		    
		}
	}

}
