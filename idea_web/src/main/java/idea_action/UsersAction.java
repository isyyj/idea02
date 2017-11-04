package idea_action;

import idea_entity.Users;
import idea_service.UserService;
import idea_service.serviceimpl.UserServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by YYJ on 2017/11/3.
 */
@Controller
public class UsersAction {
    @RequestMapping("/testfindall")
    @ResponseBody
    public List<Users>findall()
    {
        UserService userService = new UserServiceimpl();
        return userService.findall();
    }
}
