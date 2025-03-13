package bus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try (Connection conn = DatabaseConnection.getConnection()) {
            if (conn == null) {
                System.out.println("Database connection failed.");
                return;
            }

            System.out.println("Enter Customer ID: ");
            int customerID = input.nextInt();

            System.out.println("Enter Bus ID: ");
            int busID = input.nextInt();

            System.out.println("Enter Route ID: ");
            int routeID = input.nextInt();

            System.out.println("Enter Pickup Stop ID: ");
            int pickupStopID = input.nextInt();

            System.out.println("Enter Drop Stop ID: ");
            int dropStopID = input.nextInt();
            input.nextLine(); // Consume newline

            System.out.println("Enter Booking Time: ");
            String bookingTime = input.nextLine();

            System.out.println("Enter Travel Date: ");
            String travelDate = input.nextLine();

            System.out.println("Enter Return Date: ");
            String returnDate = input.nextLine();

            System.out.println("Enter Total Seat: ");
            int totalSeat = input.nextInt();

            // SQL Insert Query
            String sql = "INSERT INTO bookings (customer_id, bus_id, route_id, pickup_stop_id, drop_stop_id, booking_time, travel_date, return_date, total_seat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, customerID);
            pstmt.setInt(2, busID);
            pstmt.setInt(3, routeID);
            pstmt.setInt(4, pickupStopID);
            pstmt.setInt(5, dropStopID);
            pstmt.setString(6, bookingTime);
            pstmt.setString(7, travelDate);
            pstmt.setString(8, returnDate);
            pstmt.setInt(9, totalSeat);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Booking inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}
