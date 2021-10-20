package enlisted;


	
	import org.apache.commons.lang3.StringUtils;
	import static org.apache.commons.lang3.StringUtils.isBlank;
	import static org.apache.commons.lang3.Validate.*;
	
	public class Room  {
		
		private final String name;
		private final int capacity;
		
		Room(String name, int capacity) {
			isBlank(name);
			isTrue(StringUtils.isAlphanumeric(name),
					"Room name must be alphanumeric, was: " + name);
	isTrue( capacity>0, "Room capacity must be greater than zero. It was: "+capacity);
	this.name = name;
	this.capacity = capacity;
	
	}
		
		Room GetRoom() {
			return new Room(this.name, this.capacity);
			
			
		}
		
		int getCapacity() { return capacity; }
		
		
		
		@Override
		public String toString() { return String.format("Room name is %, capacity is %", name, capacity); }
		
		void RoomOverException(int studentsToEnlist) {
			if(this.capacity < studentsToEnlist) {
				throw new RoomOverCapacityException
					(String.format("current room: % has capacity: % but is trying to enlist: %", this, 
							capacity, studentsToEnlist));
					
				}
			
			}							
		
	}
