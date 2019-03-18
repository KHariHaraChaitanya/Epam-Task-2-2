/*
 * JUnit test for Construction cost class
 * author-K.HariHaraChaitanya project-Construction class
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructioncostTest {

	@Test
	/*
	 * test method for standard materials
	 */
	public void constructionCostTest() {
		Constructioncost cost = new Constructioncost();
		assertEquals(60000, cost.totalConstructionCost("STD", 50, false));
	}
	/*
	 * test method for above standard materials
	 */
    public void constructionCostTest1() {
    	Constructioncost cost = new Constructioncost();
		assertEquals(75000, cost.totalConstructionCost("ASTD", 50, false));
    }
    /*
	 * test method for high standard materials without automation
	 */
    public void constructionCostTest2() {
    	Constructioncost cost = new Constructioncost();
		assertEquals(90000, cost.totalConstructionCost("HSTD", 50, false));
    }
    /*
	 * test method for high standard materials with automation
	 */
    public void constructionCostTest3() {
    	Constructioncost cost = new Constructioncost();
		assertEquals(125000, cost.totalConstructionCost("HSTD", 50, true));
    }
}
