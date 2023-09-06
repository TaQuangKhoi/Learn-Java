import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SharedMapWithUserContext implements Runnable {

    public static Map<Integer, Context> userContextPerUserId
            = new ConcurrentHashMap<>();
    // init value for ConcurrentHashMap
    
    private Integer userId;
//    private UserRepository userRepository = new UserRepository();

    @Override
    public void run() {
//        String userName = userRepository.getUserNameForUserId(userId);
        String userName = "userName";
//        userContextPerUserId.put(userId, new Context(userName));
    }

    // standard constructor
}