package dependencyinversion.dip;

public class DatabaseUserRepository implements UserRepository{

    @Override
    public User getUserById(int id) {
        // Code to fetch user from database
        return new User(id, "John Doe", "johndoe@example.com");
    }
    
}
