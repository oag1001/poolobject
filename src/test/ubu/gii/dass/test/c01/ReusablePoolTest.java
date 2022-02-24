/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author alumno
 *
 */
public class ReusablePoolTest {
	private ReusablePool rpool;
	private Vector<Reusable> reusable;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		rpool = ReusablePool.getInstance();
        reusable = new Vector<Reusable>();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		for(Reusable r: reusable) {
			rpool.releaseReusable(r);
		}
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
    public void testGetInstance() {
        ReusablePool instanciaPool = ReusablePool.getInstance();

    
        assertTrue(rpool instanceof ReusablePool);
        assertTrue(instanciaPool instanceof ReusablePool);
        assertTrue("No se cumple el patrón Singleton ya que hay más de una instancia.",
                (rpool == instanciaPool) && (rpool.equals(instanciaPool)));
    }

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		fail("Not yet implemented");
	}

}
