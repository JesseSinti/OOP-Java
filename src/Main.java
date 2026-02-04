import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        ArrayList<Property> propertyList = new ArrayList<>();
        while (true) {
            System.out.println("Welcome to RentEase, would you like to view our listings/n1, add a listing/n2, remove a listing/n3");
            int choice = inputs.nextInt();
            inputs.nextLine();
            switch (choice) {
                case 1: {
                    if (propertyList.size() > 0) {
                        for (Property p : propertyList) {
                            System.out.println("location: " + p.getAddress());
                            System.out.println("Cost: " + p.getMonthlyRent());
                            System.out.println("Owner: " + p.getOwnerName());
                            System.out.println("Rentable: " + p.getAvailable());
                        }
                    } else {
                        System.out.println("No listings currently");
                    }
                }
                continue;

                case 2: {
                    System.out.println("What's the address of this property?");
                    String address = inputs.nextLine();
                    System.out.println("What is the monthly Rent?");
                    int rent = inputs.nextInt();
                    inputs.nextLine();
                    System.out.println("What is the Owners Name?");
                    String name = inputs.nextLine();
                    System.out.println("Is this property currently available?");
                    boolean available = inputs.nextBoolean();

                    Property apartment = new Property(address, rent, name, available);
                    propertyList.add(apartment);
                    continue;
                }


                case 3: {
                    if (propertyList.size() > 0) {
                        System.out.println("Provide the owner name");
                        String checkName = inputs.nextLine();
                        System.out.println("Provide the address");
                        String checkAddress = inputs.nextLine();

                        for (Property p : propertyList){
                            if (p.getOwnerName().equals(checkName) && p.getAddress().equals(checkAddress)) {
                                propertyList.remove(p);
                                System.out.println("You have successfully removed the listing");
                                break;
                            }
                        }
                    }
                }
                continue;

            }

        }
    }
}
