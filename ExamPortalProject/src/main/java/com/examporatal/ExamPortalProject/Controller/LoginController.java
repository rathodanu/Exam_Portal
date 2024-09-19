package com.examporatal.ExamPortalProject.Controller;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examporatal.ExamPortalProject.Model.Answer;
import com.examporatal.ExamPortalProject.Model.User;

@RestController
@CrossOrigin("http://localhost:4200")
public class LoginController {

	@Autowired
	SessionFactory sessionFactory;

	static HttpSession httpSession;

	@PostMapping("validate")
	public Boolean validate(@RequestBody User userfrombrowser,HttpServletRequest httpServletRequest) {
		
		Session session = sessionFactory.openSession();
		
		User userfromdatabase = session.get(User.class, userfrombrowser.getEmailid());

		boolean answer = userfrombrowser.equals(userfromdatabase);

		
		if(answer) {
			httpSession = httpServletRequest.getSession();
			httpSession.setAttribute("score", 0);
			httpSession.setAttribute("questionindex", 0);
			
		}
		HashMap<Integer,Answer> hashMap=new HashMap<Integer,Answer>();
		httpSession.setAttribute("submitteddetails", hashMap);

		return answer;

	}
}
