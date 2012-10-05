package lombok.delombok.java7;

import com.sun.tools.javac.main.JavaCompiler;

public class JavaCompilerWrapper extends lombok.delombok.JavaCompilerWrapper {

	final JavaCompiler compiler;
	
	public JavaCompilerWrapper(JavaCompiler compiler){
		this.compiler = compiler;
	}
	
	/**<pre>
	 * java7 long version:
	 * {@code
	 * com.sun.tools.javac.util.List<JCCompilationUnit> _list = toJavacList(roots);
	 * com.sun.tools.javac.util.List<JCCompilationUnit> _trees = compiler.enterTrees( _list );
	 * JavaCompiler delegate = compiler.processAnnotations( _trees );
	 * Queue<Env<AttrContext>> _attribute = delegate.attribute(delegate.todo);
	 * delegate.flow( _attribute );
	 * }
	 * </pre>
	 */
	@Override
	public void doFlowAndAttribute() {
		compiler.flow(compiler.attribute(compiler.todo));
	}

	@Override
	public void close() {
		compiler.close();
	}
	
}