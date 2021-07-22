package inventory.app.InventoryApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.app.InventoryApplication.model.Product;
import inventory.app.InventoryApplication.repository.ProductRepository;

@Service
public class ProductService {
private final ProductRepository productRepository;
	
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}


	public List<Product> getProducts() {
		return productRepository.findAll();
	}
}
