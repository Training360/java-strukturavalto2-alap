package webshop;

public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void saleProduct(long id, int amount) {
        Product product = repository.findProductById(id);
        if (product.getStock() < amount) {
            throw new IllegalArgumentException("Not enough pieces.");
        }
        repository.updateProductStock(id, amount);
    }
}
