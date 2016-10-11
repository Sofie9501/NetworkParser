package compiler.IR;

public class NPTime {
	
	int hour, minute, seconds, miliseconds;	
	
	public NPTime(int hour, int minute, int second, int milisecond){
		this.hour = hour;
		this.minute = minute;
		this.seconds = second;
		this.miliseconds = milisecond;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return seconds;
	}

	public int getMilisecond() {
		return miliseconds;
	}
	
}
