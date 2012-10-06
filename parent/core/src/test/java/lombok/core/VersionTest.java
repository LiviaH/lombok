package lombok.core;

import org.junit.Test;


public class VersionTest {

	@Test
	public void currentVersionCheck(){
		org.junit.Assert.assertEquals("0.11.5", Version.getVersion() );
	}
	
}