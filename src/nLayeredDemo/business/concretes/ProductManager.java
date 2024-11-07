package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.JLoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{
	private ProductDao productDao;
	private JLoggerService loggerService;
	

	public ProductManager(ProductDao productDao,JLoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService=loggerService;

	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return ;
		}
		this.productDao.add(product);
		loggerService.logToSystem("ürün eklendi");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	


	
	

}
