import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class JeepneyTripTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  
  // Constructor: JeepneyTrip(double distance, int totalPassengers, int discountPassengers)
  
  public void testTripCreated() {
    JeepneyTrip t = new JeepneyTrip(5, 5, 3);
    
    assertEquals(5.0, t.distance);
    assertEquals(5, t.totalPassengers);
    assertEquals(3, t.discountPassengers);
  }
  
  public void testChangeNoDiscount() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
    JeepneyTrip t2 = new JeepneyTrip(5, 2, 0);
    
    assertEquals(3.0, t.fareChange(10));
    assertEquals(6.0, t2.fareChange(20));
  }
  
  public void testChangeDiscount() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t2 = new JeepneyTrip(5, 2, 1);
    
    assertEquals(4.0, t.fareChange(10));
    assertEquals(7.0, t2.fareChange(20));
  }
  
  public void tesTotalFareDiscount() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t2 = new JeepneyTrip(5, 2, 1);

    assertEquals(6.0, t.totalFare());
    assertEquals(13.0, t2.totalFare());
  }
}
