import static org.junit.Assert.*;

import org.junit.Test;


public class Jtest {

	@Test
	public void testM() {
		double M=sumofthey.M(3600,0.15,35);
		assertEquals(3648044.0, M, 1.0);
	}
}
