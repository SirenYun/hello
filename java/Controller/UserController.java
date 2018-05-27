package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Controller.Usertable;
import service.UserServiceI;


@Controller
@RequestMapping("/userController")
public class UserController {

	@Autowired
	private UserServiceI userService;
	@Autowired
	private HttpSession session;

	@RequestMapping("/showUser/{id}")
	public String showUser(@PathVariable Integer id,
			HttpServletResponse response, HttpServletRequest request) {
		Usertable u = userService.getUserById(id);
		request.setAttribute("user", u);
		u.setUsername("mary");
		return "showUser";
	}

	@RequestMapping("/login")
	public String login(@ModelAttribute Usertable user,
			HttpServletResponse response, HttpServletRequest request) {
		session.setAttribute("user", user);
		return "forward:/userController/showUser/1.do";
	}

}
