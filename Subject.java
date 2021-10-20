package enlisted;


	
	import org.apache.commons.lang3.StringUtils;
	import static org.apache.commons.lang3.StringUtils.isBlank;
	import static org.apache.commons.lang3.Validate.*;
	
	public class Subject  {
		
		private String name = "";
		private int capacity = 0;
		
		public Subject(String string, int i) {
			// TODO Auto-generated constructor stub
		}

		public Subject(Days if1, Period h1130) {
			// TODO Auto-generated constructor stub
		}

		void Room(String name, int capacity) {
			isBlank(name);
			isTrue(StringUtils.isAlphanumeric(name),
					"Subjects identified by its alphanumeric Subject ID, was: " + name);
	isTrue( capacity>0, "A student cannot enlist in two sections with the same subject: "+capacity);
	this.name = name;
	this.capacity = capacity;
	
	}
		
		enlisted.Room GetSubject() {
			return new Room(this.name, this.capacity);
			
			
		}
		
		int getCapacity() { return capacity; }
		
		
		
		@Override
		public String toString() { return String.format("Subject name is %, capacity is %", name, capacity); }
		
		void RoomOverException(int studentsToEnlist) {
			if(this.capacity < studentsToEnlist) {
				throw new RoomOverCapacityException
					(String.format("current subject: % has capacity: % but is trying to enlist: %", this, 
							capacity, studentsToEnlist));
					
				}
			
			}							
		
	}
