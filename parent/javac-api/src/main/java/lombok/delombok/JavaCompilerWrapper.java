package lombok.delombok;

public abstract class JavaCompilerWrapper {

	/**
	 *  java6 and java7 requires different implementations!
	 */
	public abstract void doFlowAndAttribute();
	
	public abstract void close();
	
}