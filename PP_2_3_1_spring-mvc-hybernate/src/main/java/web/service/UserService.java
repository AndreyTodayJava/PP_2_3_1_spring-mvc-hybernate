package web.service;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;
@Component
public interface UserService {

    void add(User user);

    List<User> listUsers();
}
