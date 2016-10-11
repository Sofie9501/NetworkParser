package compiler.IR;

public class IR {

	public NPEntries entries;
	
	public IR() {
	}

	public IR(NPEntries entries) {
		this.entries = entries;
	}

	public NPEntries getEntries() {
		return entries;
	}

//   public static MJVariable find(String name) throws VariableNotFound {
//
//		MJVariable decl = null;
//		try {
//			decl = IR.stack.find(name);
//		} catch (VariableNotFound e) {
//			try {
//				decl = IR.classes.lookupField(currentClass, name);
//			} catch (ClassErrorField e2) {
//				throw new VariableNotFound(name);
//			}
//		}
//
//		return decl;
//	}
//
//	MJType typeCheck() throws TypeCheckerException {
//		throw new TypeCheckerException("not implemented");
//	}
//
//	void variableInit(HashSet<MJVariable> initialized)
//			throws TypeCheckerException {
//		throw new TypeCheckerException("not implemented");
//	}
//
}
