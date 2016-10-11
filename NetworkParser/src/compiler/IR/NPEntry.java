package compiler.IR;

public class NPEntry {
	
	private NPDate date;
	private NPTime time;
	private NPPacket packet;
	
	public NPEntry(NPDate date){
		this.date = date;
	}
	public NPEntry(NPDate date, NPTime time, NPPacket packet) {
		this.date = date;
		this.time = time;
		this.packet = packet;
	}

	public NPDate getDate() {
		return date;
	}

	public NPTime getTime() {
		return time;
	}

	public NPPacket getPacket() {
		return packet;
	}
	
	
}
