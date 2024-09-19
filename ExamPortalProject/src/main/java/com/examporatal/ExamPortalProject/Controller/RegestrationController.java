package com.examporatal.ExamPortalProject.Controller;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examporatal.ExamPortalProject.Model.User;

@RestController
@CrossOrigin("http://localhost:4200")
public class RegestrationController {
	@Autowired
	SessionFactory sessionFactory;
	
	@PostMapping("register")
	public void register(@RequestBody User userfrombrowser)
	{
		System.out.println(userfrombrowser);
		Session session=sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(userfrombrowser);
		beginTransaction.commit();
		
	
		
	}

}
