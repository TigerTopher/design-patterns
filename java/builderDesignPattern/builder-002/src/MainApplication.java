/**
 * Created by ibarra on 8/5/16.
 */
public class MainApplication {
    public static void main(String[] args) {
        User user = getUser();
        System.out.println("User: " + user.getFirstName() + "\n" + user.getLastName()  + "\n" + user.getAge()  + "\n" + user.getAddress()  + "\n" + user.getPhone() );
    }

    public static User getUser() {
        return new
                User.UserBuilder("Jhon", "Doe")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();
    }
}
