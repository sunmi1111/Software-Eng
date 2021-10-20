package enlisted;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {
	
	private Schedule sched604;
	private Section section604;
	private Student stud1;
	private Student stud2;
	
	//iteration1
	
	@Test
	void RoomHasExpectedCapacity() {
		
		Room room603 = new Room( "RM604", 30);
		Room room604 = new Room( "RM605", 35);
		Room room605 = new Room( "RM606", 40);
		
		assertAll(		
				() -> assertEquals( 30,room603.getCapacity()),	
				() -> assertEquals( 35,room604.getCapacity()),
				() -> assertEquals( 40,room605.getCapacity())
				
		);
	}
	
	@Test
	void enlist_room_capacity_exceeded() {
		
		
		int capacity = 1;
		new Room( "RM604", capacity);
		sched604 = new Schedule(Days.F, Period.H1130);
		section604 = new Section("Mckinley", null, sched604);
		
		stud1 = new Student(1);
		stud2 = new Student(2);
		
		stud1.enlist(section604);;
		
		assertThrows(RoomOverCapacityException.class, () -> stud2.enlist(section604));
	}
	
	//iteration2
	
	@Test
	void sections_cannot_have_the_same_room() {
		
		//cannot have the same room schedule overlap
		int capacity = 1;
		new Room( "RM604", capacity);
		sched604 = new Schedule(Days.F, Period.H1130);
		section604 = new Section("Mckinley", null, sched604);
		sched604 = new Schedule(Days.F, Period. H1300);
		section604 = new Section("Brainy", null, sched604);
		
		
	}
	
	@Test
	void Instructor() {
		// every room has a instructor
		Room room603 = new Room( "Michael", 1);
		Room room604 = new Room( "Ryan", 1);
		Room room605 = new Room( "John", 1);
		
		assertAll(		
				() -> assertEquals( 30,room603.getCapacity()),	
				() -> assertEquals( 35,room604.getCapacity()),
				() -> assertEquals( 40,room605.getCapacity())
				
		);
	}
	@Test
	void instructor_teaches_two_sections_overlap_shed() {
		
		//instructor cannot teach overlaps schedules
		int capacity = 1;
		new Room( "RM604", capacity);
		sched604 = new Schedule(Days.F, Period.H1130);
		section604 = new Section("Mckinley", "Michael", sched604);
		sched604 = new Schedule(Days.F, Period.H1130);
		section604 = new Section("Brainy", "Michael", sched604);
		
		
	}
	@Test
	void student_cancel_enlist_section() {
		
		//student cancel sections
		int capacity = 1;
		new Room( "RM605", capacity);
		sched604 = new Schedule(Days.F, Period.H1430);
		section604 = new Section("Mckinley", null, sched604);
		
		stud1 = new Student(1);
		stud2 = new Student(2);
		
		Section section605 = null;
		stud1.notenlist(section605);;
		
		assertThrows(RoomOverCapacityException.class, () -> stud2.notenlist(section605));
	}
}
