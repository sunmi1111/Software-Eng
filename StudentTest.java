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
		Section sec1 = new Section("A", new Schedule(Days.MTH, Period.H0830));
		Section sec2 = new Section("B", new Schedule(Days.TF, Period.H1000));
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
		//given one student and 2 sections w/ same sked
		Student student = new Student(1, Collections.emptyList());
		Section sec1 = new Section("A", new Schedule(Days.MTH, Period.H0830));
		Section sec2 = new Section("B", new Schedule(Days.MTH, Period.H0830));
		
		//when the student enlists in both section 
		student.enlist(sec1);
		
		
		//then an exception should be thrown in the section enlistment
		assertThrows(ScheduleConflictException.class, () ->student.enlist(sec2));
		
	}

}
