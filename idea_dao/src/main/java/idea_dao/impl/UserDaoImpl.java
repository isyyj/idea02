package idea_dao.impl;

import idea_dao.UsersDao;
import idea_entity.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YYJ on 2017/11/3.
 */
public class UserDaoImpl implements UsersDao {

    @Override
    public List<Users> findall() {
        List<Users>list= new ArrayList<>();
        for (int i=0;i<10;i++)
        {
            Users users = new Users();
            users.setUid(i);
            users.setUname("yyj"+i);
            list.add(users);
        }
        return list;
    }
}
