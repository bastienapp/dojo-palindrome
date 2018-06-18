import junit.framework.*;
import org.junit.Test;

public class PalindromeTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testNull() throws Exception {
        try {
            Palindrome.check(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Argurment is null", e.getMessage());
        }
	}

	@Test
	public void test1() throws Exception {
		assertEquals(true, Palindrome.check("AA"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(false, Palindrome.check("AB"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(true, Palindrome.check("ABBA"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(true, Palindrome.check("KAYAK"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(false, Palindrome.check("TACOS"));
	}
}
