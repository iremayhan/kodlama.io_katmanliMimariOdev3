package oopWithNLayeredKodlama.io.dataAccess;

import oopWithNLayeredKodlama.io.entities.Category;
import oopWithNLayeredKodlama.io.entities.Course;
import oopWithNLayeredKodlama.io.entities.Instructor;

public class JdbcDao implements InstructorDao, CourseDao, CategoryDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Jdbc ile veritabanına eklendi.");
	}

	@Override
	public void add(Category category) {
		System.out.println("Kategori Jdbc ile veritabanına eklendi.");
	}

	@Override
	public void add(Course course) {
		System.out.println("Kurs Jdbc ile veritabanına eklendi.");
	}

}
