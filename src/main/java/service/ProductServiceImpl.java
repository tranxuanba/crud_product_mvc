package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "an may", 120, "do tot"));
        products.put(2, new Product(2, "an may1", 130, "do tot1"));
        products.put(3, new Product(3, "an ma2", 120, "do tot2"));
        products.put(4, new Product(4, "an may3", 150, "do tot3"));
        products.put(5, new Product(5, "an may4", 160, "do tot4"));
        products.put(6, new Product(6, "an may5", 120, "do tot5"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remote(int id) {
        products.remove(id);
    }
}
