package Test1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Patiant;
import dao.TestDao;

@WebServlet("/Task")
public class Task1 extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String firstName=req.getParameter("fname");
		String lastName=req.getParameter("lname");
		String Sage=req.getParameter("age");
		int age=Integer.parseInt(Sage);
		String sDate=req.getParameter("date");
		Date s1 = null;
		try {
			s1 = new SimpleDateFormat("dd/mm/yyyy").parse(sDate);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
	
		
		Date s2=null;
		Date s3=null;
		String hospital=req.getParameter("Hname");
		String sTotal=req.getParameter("total");
		int total=Integer.parseInt(sTotal);
		
		String city=req.getParameter("city");
		
		String Adate=req.getParameter("Adate");
		
		
		try {
			s2 = new SimpleDateFormat("dd/mm/yyyy").parse(Adate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	
		String Ddate=req.getParameter("Ddate");
		
	
		try {
			s3 = new SimpleDateFormat("dd/mm/yyyy").parse(Ddate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
		Patiant bean = new Patiant(firstName, lastName, city, hospital, total, total, s1,s2,s3);
		
		int status=TestDao.save(bean);
		if(status==1){
			System.out.println("Record Saved");
		}
		
		
	}
	
	
	
}
