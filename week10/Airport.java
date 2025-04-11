package week10;

/*3. An airport tracks departing flights sorted by departure time and calculates additional statistics such as:
    • Total number of flights
    • Earliest and latest departure times
    • Total flight duration for a specific destination
Task:
    1. Use TreeMap<String, Flight> where departure time (HH:MM format) is the key and Flight object (flight number, destination, duration in minutes) is the value.
    2. Implement the following methods:
        ◦ addFlight(String time, String flightNo, String destination, int duration)
        ◦ removeFlight(String time)
        ◦ displayAllFlights() (sorted by departure time)
        ◦ getTotalFlights() (returns total number of flights)
        ◦ getEarliestAndLatestFlights() (prints earliest and latest flight details)
        ◦ calculateTotalDurationForDestination(String destination) (returns total duration of flights to a specific destination)

input
AirportFlightManagement airport = new AirportFlightManagement();
airport.addFlight("08:30", "AI101", "New York", 420);
airport.addFlight("10:15", "BA202", "London", 360);
airport.addFlight("12:00", "AF303", "Paris", 150);
airport.addFlight("15:45", "EK404", "Dubai", 300);

Output:
Flights in order of departure:
08:30 - AI101 to New York (420 min)
10:15 - BA202 to London (360 min)
12:00 - AF303 to Paris (150 min)
15:45 - EK404 to Dubai (300 min)
18:20 - AI505 to New York (450 min)

Total flights: 5

Earliest flight: AI101 to New York at 08:30
Latest flight: AI505 to New York at 18:20

Total duration for flights to New York: 870 minutes

Flight at 12:00 removed.

Flights in order of departure:
08:30 - AI101 to New York (420 min)
10:15 - BA202 to London (360 min)
15:45 - EK404 to Dubai (300 min)
18:20 - AI505 to New York (450 min)
*/
import java.util.Scanner;
import java.util.TreeMap;

class Flight {
    String time;
    String flightNo;
    String destination;
    int duration;

    Flight(String time, String flightNo, String destination, int duration) {
        this.time = time;
        this.flightNo = flightNo;
        this.destination = destination;
        this.duration = duration;
    }
}

public class Airport {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Flight> list = new TreeMap<>();
        System.out.print("Enter number of fights: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Flight " + (i + 1));
            System.out.print("Time: ");
            String time = sc.next();
            System.out.print("Flight Number: ");
            String flightNo = sc.next();
            System.out.print("Destinstion: ");
            String destination = sc.next();
            System.out.print("Duration: ");
            int duration = sc.nextInt();
            list.put(time, new Flight(time, flightNo, destination, duration));
        }
        System.out.println("Flights in order of departure: ");
        System.out.print(list);
        System.out.println("Total no of flights: " + n);
        sc.close();

    }
}

/*
 * Sample Input:
 * Enter number of flights: 4
 * Flight 1
 * Time: 08:30
 * Flight Number: AI101
 * Destination: New York
 * Duration: 420
 * Flight 2
 * Time: 10:15
 * Flight Number: BA202
 * Destination: London
 * Duration: 360
 * Flight 3
 * Time: 12:00
 * Flight Number: AF303
 * Destination: Paris
 * Duration: 150
 * Flight 4
 * Time: 15:45
 * Flight Number: EK404
 * Destination: Dubai
 * Duration: 300
 * 
 * Sample Output:
 * Flights in order of departure:
 * 08:30 - AI101 to New York (420 min)
 * 10:15 - BA202 to London (360 min)
 * 12:00 - AF303 to Paris (150 min)
 * 15:45 - EK404 to Dubai (300 min)
 * 
 * Total no of flights: 4
 */
