package dependencyinversion.dip;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(int id) {
        return userRepository.getUserById(id);
    }
}
