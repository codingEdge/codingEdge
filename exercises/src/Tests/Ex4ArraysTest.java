package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex4Arrays;

public class Ex4ArraysTest {
	
	@Test
	public void q1_firstStringTest() {
		assertEquals("abc", Ex4Arrays.q1_firstString(new String[] {"abc","def","ghi"}));
		assertEquals("abc", Ex4Arrays.q1_firstString(new String[] {"abc","ghi"}));
	}
	
	@Test
	public void q2_secondStringTest() {
		assertEquals("def", Ex4Arrays.q2_secondString(new String[] {"abc","def","ghi"}));
		assertEquals("ghi", Ex4Arrays.q2_secondString(new String[] {"abc","ghi"}));
	}
	
	@Test
	public void q3_getArrayLengthTest() {
		assertEquals(0, Ex4Arrays.q3_getArrayLength(new int[] {}));
		assertEquals(1, Ex4Arrays.q3_getArrayLength(new int[] {1}));
		assertEquals(5, Ex4Arrays.q3_getArrayLength(new int[] {1, 2, 3, 4, 5}));
	}
	
	@Test
	public void q4_getLastIntegerTest() {
		assertEquals(1, Ex4Arrays.q4_getLastInteger(new int[] {1}));
		assertEquals(9, Ex4Arrays.q4_getLastInteger(new int[] {1, 5, -3, 10, 9}));
		assertEquals(-5, Ex4Arrays.q4_getLastInteger(new int[] {1, 2, 3, 4, -5}));
	}
	
}
