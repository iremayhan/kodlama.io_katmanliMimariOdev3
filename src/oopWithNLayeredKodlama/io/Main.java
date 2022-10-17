package oopWithNLayeredKodlama.io;

import java.util.ArrayList;

import oopWithNLayeredKodlama.io.business.CategoryManager;
import oopWithNLayeredKodlama.io.business.CourseManager;
import oopWithNLayeredKodlama.io.business.InstructorManager;
import oopWithNLayeredKodlama.io.core.logging.DatabaseLogger;
import oopWithNLayeredKodlama.io.core.logging.FileLogger;
import oopWithNLayeredKodlama.io.core.logging.Logger;
import oopWithNLayeredKodlama.io.core.logging.MailLogger;
import oopWithNLayeredKodlama.io.dataAccess.HibernateDao;
import oopWithNLayeredKodlama.io.entities.Base;
import oopWithNLayeredKodlama.io.entities.Category;
import oopWithNLayeredKodlama.io.entities.Course;
import oopWithNLayeredKodlama.io.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Base base = new Base();
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		
	
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers);
		instructorManager.add(instructor);
		
		Category[] categories = {new Category()};
		Category category = new Category(1, "Backend");
		Category category2 = new Category (2,"Backend");
		Category category3 = new Category (3,"AHMET");
		
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		categoryManager.add(category);
		categoryManager.add(category2);
		categoryManager.add(category3);
		
		Course[] courses = {new Course()};
		Course course = new Course(1, "Java kampı", "Backend", 3 , "Java kamp duyuruları buradan yapılacak", 0, "Engin Demiroğ");
		Course course2 = new Course(2, "Java kampı", "Backend", 0, "Java kamp duyuruları buradan yapılacak", 0, "Engin Demiroğ");
		Course course3= new Course(3,"","",10,"",0,"");
		
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		courseManager.add(course);
		courseManager.add(course2);
		courseManager.add(course3);
		
		
	}

}
