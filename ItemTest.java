import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testItemObject() {
    Item i = new Item(1000, 0.10);
    
    assertEquals(1000.0, i.price);
    assertEquals(0.10, i.sale);
  }
  
  public void testSalePrice1000noDiscountlessThan1000() {
    Item i = new Item(1000, 0.10);
    Item i2 = new Item(999, 0.10);
    Item i3 = new Item(999.9, 0.10);
    
    
    assertEquals(1000.0, i.salePrice1000());
    assertEquals(999.0, i2.salePrice1000());
    assertEquals(999.9, i3.salePrice1000());
  }
  
  public void testSalePrice1000moreThan1000() {
    Item i = new Item (1500.0, 0.15);
    Item i2 = new Item (1001, 0.10);
    Item i3 = new Item(1000.1, 0.10);
    
    assertEquals(1275.0, i.salePrice1000());
    assertEquals(900.9, i2.salePrice1000());
    assertEquals(900.09, i3.salePrice1000());
  }
  
}
