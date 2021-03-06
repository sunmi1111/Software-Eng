package enlisted;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void enlist_2_sections_no_sked_overlap() {
		// Given one student and 2 sections
		Student student = new Student(1);
		Section sec1 = new Section("A", null, new Schedule(Days.MTH, Period.H0830));
		Section sec2 = new Section("B", null, new Schedule(Days.TF, Period.H1000));
		// When the student enlists in both sections
		student.enlist(sec1);
		student.enlist(sec2);
		
		// Then both sections can be found in the student , but no other
		Collection<Section> sections = student.getSections();
		assertAll(
				() -> assertTrue(sections.containsAll(List.of(sec1, sec2))), () -> assertEquals(2, sections.size()));
		
	}
	@Test
	void enlist_2_sections_same_schedule() {
		//given one student and 2 sections w/ same schedule
		Student student = new Student(1, Collections.emptyList());
		Section sec1 = new Section("A", null, new Schedule(Days.MTH, Period.H0830));
		Section sec2 = new Section("B", null, new Schedule(Days.MTH, Period.H0830));
		
		//when the student enlists in both section 
		student.enlist(sec1);
		
		
		//then an exception should be thrown in the section enlistment
		assertThrows(ScheduleConflictException.class, () ->student.enlist(sec2));
		
	}
	
	//iteration3
	//Periods may be of any duration of 30-minutes increments
	
	@Test
	void duration_of_30mins_increments() {

		new Section("A", null, new Schedule(Days.MTH, Period.H0830));
		new Section("B", null, new Schedule(Days.MTH, Period.H1130));
		new Section("C", null, new Schedule(Days.MTH, Period.H1430));
		new Section("D", null, new Schedule(Days.MTH, Period.H1530));
		
	}
	@Test
	void Valid_Periods() {

		Period.of(8,9,12);
		Period.of(12,2,4);
		Period.of(4,6, 0);
		
	}


}
