class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final double BASE_FARE = 7.0;
  final double DISC_FARE = 6.0;
  final double EXCESS_FARE = 0.5;
  
  // Constructor
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  // -> double
  // Returns a value if there is any excess km from the base kilometer travelled by the passengers.
  // Returns 0 if excess is not more than 5.
  double excessDistance() {
    if (distance <= BASE_KM) {
      return 0;
    } else {
      return distance - BASE_KM;
    }
  }
  
  // -> double
  // Returns the total amount due of the excess kilometers travelled by the passengers.
  // Computed by multiplying the total excess distance by excess distance travelled by passengers.
  double excessDistancePrice() {
    return excessDistance() * EXCESS_FARE;
  }
  
  // double, double -> double
  // Returns the total fare of a specific type of passengers.
  double computeFare(double passengers, double fare) {
    return passengers * (fare + excessDistancePrice());
  }
  
  // -> double
  // Returns the total fare given the total amount of passengers, number
  // of passengers with discount with regards to the trip distance.
  double totalFare() {
    return computeFare(totalPassengers - discountPassengers, BASE_FARE) + computeFare(discountPassengers, DISC_FARE);
  }
  
  // double -> double
  // Returns the change, given the paid fare, total number of passengers,
  // number of passengers with discount, and the trip distance.
  double fareChange(double payment) {
    return payment - totalFare() ;
  }
}
