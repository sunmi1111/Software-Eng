public class Time {

    int seconds;
    int minutes;
    int hours;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {

      // TIME CLASS
        Time start = new Time(8, 30, 0);
        Time stop = new Time(6, 30, 0);
        Time diff;

        // difference
        diff = Periods(start, stop);

        System.out.printf("TIME PERIODS: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    public static Time Periods(Time start, Time stop)
    {
        Time diff = new Time(0, 0, 0);

        
        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }

        diff.seconds = stop.seconds - start.seconds;

        
        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }

        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;

        // time teturn difference
        return(diff);
    }
}