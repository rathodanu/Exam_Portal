package com.examporatal.ExamPortalProject.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examporatal.ExamPortalProject.Model.Question;

@RestController
@CrossOrigin("http://localhost:4200")
public class QuestionController {

	@Autowired
	SessionFactory factory;

	
	@GetMapping("getFirstQuestion/{subject}")
	public Question getFirstQuestion(@PathVariable String subject) {
		System.out.println("subject from angular is " + subject);
		HttpSession httpSession = LoginController.httpSession;
		Session session = factory.openSession();
		Query query = session.createQuery("from Question where subject=:subject");

		query.setParameter("subject", subject);

		List<Question> list = query.list();
		httpSession.setAttribute("allquestions", list);

		Question question = list.get(0);
		return question;
	}

	@RequestMapping("nextQuestion")
	public Question nextQuestion() {
		HttpSession httpSession = LoginController.httpSession;
		List<Question> listofquestion = (List<Question>) httpSession.getAttribute("allquestions");
		Question question=null;
		
		if((int)httpSession.getAttribute("questionindex")<listofquestion.size()-1) {
			httpSession.setAttribute("questionindex", (int)httpSession.getAttribute("questionindex")+1);
			
			listofquestion.get((int)httpSession.getAttribute("questionindex"));
			 
		}
		else {
			httpSession.setAttribute("questionindex", 0);
			listofquestion.get((int)httpSession.getAttribute("questionindex"));
		}
		return question;

	}

}
