/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;
import ubu.gii.dass.c01.NotFreeInstanceException;

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
		ReusablePool pool = ReusablePool.getInstance();
		
		assertNotNull(pool);
		
		assertEquals(rpool, ReusablePool.getInstance());
        }

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		
		try {
			for (int i = 0; i < 3; i++) {
				reusable.add(rpool.acquireReusable());
			}
		} catch (NotFreeInstanceException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
	}

}
