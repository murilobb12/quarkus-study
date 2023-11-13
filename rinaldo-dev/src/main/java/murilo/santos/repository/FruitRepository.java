package murilo.santos.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import murilo.santos.model.Fruit;

@ApplicationScoped
public class FruitRepository implements PanacheRepository<Fruit> {



}
