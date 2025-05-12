package bookmarkio.managers;

import bookmarkio.entities.User;

public class UserManager {

    private static UserManager instance = new UserManager();

    private UserManager() {
    }

    public static UserManager getInstance() {
        return instance;
    }

    public User createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType
    ) {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setPassword(password);
        user.setUserType(userType);

        return user;

    }

}
