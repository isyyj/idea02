package idea_service.serviceimpl;

import idea_dao.UsersDao;
import idea_dao.impl.UserDaoImpl;
import idea_entity.Users;
import idea_service.UserService;

import java.util.List;

/**
 * Created by YYJ on 2017/11/3.
 */
public class UserServiceimpl implements UserService {
    @Override
    public List<Users> findall() {
        UsersDao usersDao = new UserDaoImpl();
        return usersDao.findall();
    }
}
