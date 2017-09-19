import junit.framework.*;
import org.junit.Test;

public class PalindromeTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}
	@Test
	public void test1() throws Exception {
		String test = "AA";
		assertEquals(Palindrome.isPalindrome(test), true);
	}
	@Test
	public void test2() throws Exception {
		String test = "AB";
		assertEquals(Palindrome.isPalindrome(test), false);
	}
	@Test
	public void test3() throws Exception {
		String test = "KAYAK";
		assertEquals(Palindrome.isPalindrome(test), true);
	}
}