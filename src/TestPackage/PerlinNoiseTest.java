package TestPackage;
import racingplatformer.math.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class PerlinNoiseTest {
	private PerlinNoise pNoise;
	@Test
	public void test() {
		return;
	}
	@Test
	public void testgetSmoothNoise() {
		assertEquals(pNoise.getSmoothNoise(100,45),pNoise.getSmoothNoise(100, 90),.02);
		
	}

}
