package dependencyinversion.notdip;

public class UserService {
    private UserRepository userRepository;

    public UserService(){
        this.userRepository = new UserRepository();
    }

    public User getUser(int id){
        return userRepository.getUserById(id);
    }
}
