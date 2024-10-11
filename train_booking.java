import java.util.ArrayList;
import java.util.Scanner;

public class train_booking {
    static final int TOTAL_SEATS = 80;
    static int[] seats = new int[TOTAL_SEATS]; // 0 = available, 1 = booked
    static final int ROWS = 11; // 10 rows of 7 seats, 1 row of 3 seats
    static final int[] rowSizes = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 3}; // Sizes of each row

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of seats to book (1 to 7):");
            int seatRequest = scanner.nextInt();
            
            if (seatRequest < 1 || seatRequest > 7) {
                System.out.println("Invalid number of seats. Please enter a number between 1 and 7.");
                continue;
            }
            
            ArrayList<Integer> bookedSeats = bookSeats(seatRequest);
            if (bookedSeats.isEmpty()) {
                System.out.println("Not enough seats available.");
            } else {
                System.out.println("Seats booked: " + bookedSeats);
                displaySeats();
            }
            
            if (isCoachFull()) {
                System.out.println("All seats are booked. No more bookings can be made.");
                break;
            }
        }
        scanner.close();
    }

    // Function to book seats
    public static ArrayList<Integer> bookSeats(int numSeats) {
        ArrayList<Integer> bookedSeats = new ArrayList<>();
        
        // Try to find seats in the same row
        for (int row = 0; row < ROWS; row++) {
            int rowStart = getRowStartIndex(row);
            int availableInRow = 0;
            
            for (int i = rowStart; i < rowStart + rowSizes[row]; i++) {
                if (seats[i] == 0) {
                    availableInRow++;
                } else {
                    availableInRow = 0; // Reset if a booked seat is encountered
                }
                
                if (availableInRow == numSeats) {
                    // Book the seats in this row
                    for (int j = i; j > i - numSeats; j--) {
                        seats[j] = 1;
                        bookedSeats.add(j + 1); // Seat numbers start from 1
                    }
                    return bookedSeats;
                }
            }
        }
        
        // If no single row has enough seats, book them across rows
        for (int row = 0; row < ROWS; row++) {
            int rowStart = getRowStartIndex(row);
            for (int i = rowStart; i < rowStart + rowSizes[row]; i++) {
                if (seats[i] == 0) {
                    seats[i] = 1;
                    bookedSeats.add(i + 1);
                    if (bookedSeats.size() == numSeats) {
                        return bookedSeats;
                    }
                }
            }
        }
        
        // If not enough seats could be found
        return new ArrayList<>();
    }

    // Function to check if the coach is fully booked
    public static boolean isCoachFull() {
        for (int seat : seats) {
            if (seat == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to display seat availability
    public static void displaySeats() {
        System.out.println("Current seat availability (0 = available, 1 = booked):");
        int seatNumber = 1;
        for (int row = 0; row < ROWS; row++) {
            for (int i = 0; i < rowSizes[row]; i++) {
                System.out.print(seats[seatNumber - 1] + " ");
                seatNumber++;
            }
            System.out.println(); // New row
        }
    }

    // Helper function to get the starting index of a row in the seat array
    public static int getRowStartIndex(int row) {
        int index = 0;
        for (int i = 0; i < row; i++) {
            index += rowSizes[i];
        }
        return index;
    }
}
