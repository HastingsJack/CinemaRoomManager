package cinema;

import java.util.Scanner;

public class Cinema {

    private static int numberOfTickets = 0;
    private static int currentIncome = 0;
    private static int totalIncome = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = getRows(sc);
        int seats = getSeats(sc);
        int totalSeats = rows * seats;
        String[][] cinema = new String[rows+1][seats+1];
        buildSeating(cinema, rows, seats);
        setTotalIncome(rows, seats);
        boolean tickets = true;
        while(tickets) {
            menu();
            int choice = checkInt(sc);
            switch (choice) {
                case 1: showSeats(cinema); break;
                case 2: buyTicket(cinema,sc, rows, seats); break;
                case 3: statistics(totalSeats); break;
                case 0: tickets = false; break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static int getSeats(Scanner sc) {
        System.out.println("Enter the number of seats in each row:");
        int seats = checkInt(sc);
        while(!(seats > 0)) {
            System.out.println("Enter a number greater than 0!");
            seats = checkInt(sc);
        }
        return seats;
    }

    private static int getRows(Scanner sc) {
        System.out.println("Enter the number of rows:");
        int rows = checkInt(sc);
        while(!(rows > 0)) {
            System.out.println("Enter a number greater than 0!");
            rows = checkInt(sc);
        }
        return rows;
    }

    public static void buildSeating(String[][] cinema, int rows, int seats) {
        for(int i = 0; i <= rows; i++) {
            for(int j = 0; j <= seats; j++) {
                if(i == 0 && j == 0) {
                    cinema[0][0] = "  ";
                } else if(i == 0 && j != 0) {
                    cinema[0][j] = j + " ";
                } else if (i != 0 && j == 0) {
                    cinema[i][0] = i + " ";
                } else {
                    cinema[i][j] = "S ";
                }
            }
        }
    }

    public static void menu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    public static void showSeats(String[][] cinema) {
        System.out.println("Cinema:");
        for (String[] strings : cinema) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    public static void buyTicket(String[][] cinema, Scanner sc, int rows, int seats) {
        int rowsSeat = getRowsSeat(sc);
        int seatsSeat = getSeatsSeat(sc);

        if(rowsSeat > rows || seatsSeat > seats) {
            System.out.println("Wrong input!");
            buyTicket(cinema, sc, rows, seats);
        }
        if(cinema[rowsSeat][seatsSeat].equals("B ")) {
            System.out.println("That ticket has already been purchased!");
            System.out.println();
            buyTicket(cinema, sc, rows, seats);
        }
        int price = getPrice(rows, seats, rowsSeat);
        System.out.println("\nTicket price: $" + price + "\n");
        if(!cinema[rowsSeat][seatsSeat].equals("B ")) {
            cinema[rowsSeat][seatsSeat] = "B ";
            numberOfTickets++;
            currentIncome += price;
        }
    }

    private static int getRowsSeat(Scanner sc) {
        System.out.println("Enter a row number:");
        int rowsSeat = checkInt(sc);
        return (rowsSeat > 0) ? rowsSeat : getRowsSeat(sc);
    }

    private static int getSeatsSeat(Scanner sc) {
        System.out.println("Enter a seat number in that row:");
        int seatsSeat = checkInt(sc);
        return (seatsSeat > 0) ? seatsSeat : getSeatsSeat(sc);
    }

    private static int getPrice(int rows, int seats, int rowsSeat) {
        int price;
        if(rows * seats < 60) {
            price = 10;
        } else if (rowsSeat <= rows / 2) {
            price = 10;
        } else {
            price = 8;
        }
        return price;
    }

    public static void statistics(int totalSeats) {
        //number of purchased tickets
        System.out.println("Number of purchased tickets: " + numberOfTickets);
        //number of purchased tickets represented by percentage
        System.out.printf("Percentage: %.02f%%%n" ,(double)numberOfTickets/totalSeats*100);
        //current income
        System.out.println("Current income: $" + currentIncome);
        //total income of all tickets sold
        System.out.println("Total income: $" + totalIncome);
        System.out.println();
    }

    public static void setTotalIncome(int rows, int seats) {
        int first = seats * (rows / 2);
        int back = seats * (rows - (rows / 2));
        if(rows * seats < 60) {
            totalIncome = 10 * rows * seats;
        }
        if(rows * seats >= 60) {
            totalIncome = 10 * (first) + (8 * back);
        }
    }

    public static int checkInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a number!");
            scan.next();
        }
        return scan.nextInt();
    }
}