package oopWithNLayeredKodlama.io.dataAccess;

import oopWithNLayeredKodlama.io.entities.Category;
import oopWithNLayeredKodlama.io.entities.Course;
import oopWithNLayeredKodlama.io.entities.Instructor;

public class HibernateDao implements InstructorDao, CategoryDao, CourseDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veritabanına eklendi.");
	}

	@Override
	public void add(Category category) {
		System.out.println("Ktegori Hibernate ile veritabanına eklendi.");
	}

	@Override
	public void add(Course course) {
		System.out.println("Kurs Hibernate ile veritabanına eklendi.");
	}

}
