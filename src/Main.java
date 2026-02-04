import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        ArrayList<Property> propertyList = new ArrayList<>();
        while (true) {
            System.out.println("Welcome to RentEase, would you like to view our listings/n1, add a listing/n2, remove a listing/n3, update a listing/n4");
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
                    continue;
                }

                case 4: {
                    if (propertyList.size() > 0) {
                        System.out.println("Provide the owner name");
                        String checkName = inputs.nextLine();
                        System.out.println("Provide the address");
                        String checkAddress = inputs.nextLine();

                        for (Property p : propertyList){
                            if (p.getOwnerName().equals(checkName) && p.getAddress().equals(checkAddress)) {
                                propertyList.remove(p);
                                System.out.println("What would you like to change?");
                                String choices = inputs.nextLine();
                                if (choices.equalsIgnoreCase("name")) {
                                    System.out.println("What would you like to change the owner's name to?");
                                    String new_Name = inputs.nextLine();
                                    p.setOwnerName(new_Name);
                                    System.out.println("You have changed the name to: " + new_Name);
                                } else if (choices.equalsIgnoreCase("address")) {
                                    System.out.println("What would you like to change the address to?");
                                    String new_Address = inputs.nextLine();
                                    p.setAddress(new_Address);
                                    System.out.println("You have changed the address to: " + new_Address);
                                } else if (choices.equalsIgnoreCase("available")) {
                                    System.out.println("What would you like to change the availability to?");
                                    boolean new_Available = inputs.nextBoolean();
                                    inputs.nextLine();
                                    p.setAvailable(new_Available);
                                    System.out.println("You have changed the availability to " + new_Available);
                                } else if (choices.equalsIgnoreCase("rent")) {
                                    System.out.println("What would you like to change the monthly rent to?");
                                    int new_Rent = inputs.nextInt();
                                    inputs.nextLine();
                                    p.setMonthlyRent(new_Rent);
                                    System.out.println("You have changed the monthly rent to: $" + new_Rent);
                                } else {
                                    System.out.println("Incorrect options");
                                    continue;
                                }
                                break;
                            }
                        }
                    }
                }


            }

        }
    }
}
