package by.class7;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> users;

    static {
        users = new ArrayList<>();

        users.add(new User("admin", "123456", "Захар", "Беркут"));
        users.add(new User("vasia", "3456", "кирилл", "романовский"));
        users.add(new User("alya", "123", "никита", "костров"));

    }


}
