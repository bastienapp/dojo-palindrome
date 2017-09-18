import junit.framework.*;
import org.junit.Test;

public class PalindromeTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		assertEquals(true, Palindrome.isPalindrome("kayak"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(false, Palindrome.isPalindrome("lucas"));
	}
}