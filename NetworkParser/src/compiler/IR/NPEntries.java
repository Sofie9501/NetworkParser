package compiler.IR;

import java.util.LinkedList;

public class NPEntries {

	private LinkedList<NPEntry> list;
	
	public NPEntries(){
		
	}

	public NPEntries(LinkedList<NPEntry> list) {
		this.list = list;
	}

	public LinkedList<NPEntry> getEntries() {
		return list;
	}

}



