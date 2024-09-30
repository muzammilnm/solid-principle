package dependencyinversion.notdip;

public class UserRepository {
    public User getUserById(int id){
        // Code to fetch user from database
        return new User(id, "john", "john@gmail.com");
    }
}
