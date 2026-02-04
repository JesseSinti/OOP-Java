public class Property {
    private String address;
    private int monthlyRent;
    private String ownerName;
    private boolean available;

    public Property(String address, int monthlyRent, String ownerName, boolean available) {
        this.address = address;
        this.monthlyRent = monthlyRent;
        this.ownerName = ownerName;
        this.available = available;
    }

    public String getAddress() {return address;}
    public int getMonthlyRent() {return monthlyRent;}
    public String getOwnerName() {return ownerName;}
    public boolean getAvailable() {return available;}

    public void setAddress(String address) {this.address = address;}
    public void setMonthlyRent(int monthlyRent) {this.monthlyRent = monthlyRent;}
    public void setOwnerName(String ownerName) {this.ownerName = ownerName;}
    public void setAvailable(boolean available) {this.available = available;}


}
