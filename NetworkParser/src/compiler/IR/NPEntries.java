package compiler.IR;

import java.util.LinkedList;

public class NPEntries extends IR{

	private LinkedList<NPEntry> list;
	
	public NPEntries(){
		
	}

	public NPEntries(LinkedList<NPEntry> list) {
		this.list = list;
	}

	public LinkedList<NPEntry> getEntriesList() {
		return list;
	}

}



