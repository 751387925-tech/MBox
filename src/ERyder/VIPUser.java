package ERyder;
public class VIPUser extends RegisteredUsers {
    
    public VIPUser(String fullName, String emailAddress, String dateOfBirth, long cardNumber, String cardExpiryDate, String cardProvider, int cvv) {
        super(fullName, emailAddress, dateOfBirth, cardNumber, cardExpiryDate, cardProvider, cvv);
    if (userType.equalsIgnoreCase("VIP")) {
        newUser = new VIPUser(fullName, emailAddress, dateOfBirth, cardNumber, cardExpiryDate, cardProvider, cvv);}
    else {
        newUser = new RegularUser(fullName, emailAddress, dateOfBirth, cardNumber, cardExpiryDate, cardProvider, cvv, "Regular");
    }
        RegisteredUsersList.add(newUser);
    }
    @Override
    public double calculateFare(double baseFare) {
        return baseFare * 0.8;
    }
    @Override
    public void displayUserType() {
        System.out.println("VIP User");
    }

}