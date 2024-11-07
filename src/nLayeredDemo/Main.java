package nLayeredDemo;

import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.core.JLoggerService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductService productService =new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		
		Product product =new Product (1,2,"Elma",12,49);
		productService.add(product);
		
	}

}
