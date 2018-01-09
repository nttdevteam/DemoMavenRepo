import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * 
 */

/**
 * @author 133661
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class methodsFileTest {

	/**
	 * Test method for {@link methodsFile#addition(int, int)}.
	 */
	@InjectMocks
	methodsFile methfile;
	
	@Test
	public void testAddition() {
		int a=6;
		int b=3;
		methfile.addition(a, b);
		Assert.assertNotNull(methfile);
	}

	/**
	 * Test method for {@link methodsFile#subtraction(int, int)}.
	 */
	@Test
	public void testSubtraction() {
		int a=6;
		int b=3;
		methfile.subtraction(a, b);
		Assert.assertNotNull(methfile);
	}

	/**
	 * Test method for {@link methodsFile#multiplication(int, int)}.
	 */
	@Test
	public void testMultiplication() {
		int a=6;
		int b=3;
		methfile.multiplication(a, b);
		Assert.assertNotNull(methfile);
	}

	/**
	 * Test method for {@link methodsFile#division(int, int)}.
	 */
	@Test
	public void testDivision() {
		int a=6;
		int b=3;
		methfile.division(a, b);
		Assert.assertNotNull(methfile);
	}

}
