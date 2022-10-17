package oopWithNLayeredKodlama.io.business;

import java.util.ArrayList;

import oopWithNLayeredKodlama.io.core.logging.Logger;
import oopWithNLayeredKodlama.io.dataAccess.CourseDao;
import oopWithNLayeredKodlama.io.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;

	}

	ArrayList<String> _courses = new ArrayList<String>();

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}

		for (String _course : _courses) {

			if (_course == course.getName()) {
				throw new Exception("Aynı isimde başka bir kurs bulunuyor, yeni bir isim deneyiniz.");
			}
		}

		_courses.add(course.getName());
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
