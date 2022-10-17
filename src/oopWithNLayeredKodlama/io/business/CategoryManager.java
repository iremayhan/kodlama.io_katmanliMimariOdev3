package oopWithNLayeredKodlama.io.business;


import java.util.ArrayList;

import oopWithNLayeredKodlama.io.core.logging.Logger;
import oopWithNLayeredKodlama.io.dataAccess.CategoryDao;
import oopWithNLayeredKodlama.io.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		
	}
	ArrayList<String>_categories = new ArrayList<String>();
	public void add(Category category) throws Exception {
		for (String _category : _categories) {
			if (_category == category.getName()) {
				throw new Exception("Aynı isimde başka bir kategori bulunuyor, yeni bir isim belirleyiniz.");
			}
		}
		_categories.add(category.getName());
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());

		}
	}
}
