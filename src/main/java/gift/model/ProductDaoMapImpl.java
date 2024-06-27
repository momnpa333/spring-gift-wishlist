package gift.model;

import gift.controller.ProductRequest;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoMapImpl implements ProductDao {

    private final Map<Long, Product> database = new ConcurrentHashMap<>();

    @Override
    public Product save(Product product) {
        database.put(null, product);
        return product;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(database.get(id));
    }

    @Override
    public List<Product> findAll() {
        return List.copyOf(database.values());
    }

    @Override
    public void deleteById(Long id) {
        database.remove(id);
    }

    @Override
    public Product update(Long id, Product request) {
        return null;
    }

}
