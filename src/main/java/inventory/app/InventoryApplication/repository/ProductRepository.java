package inventory.app.InventoryApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import inventory.app.InventoryApplication.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
