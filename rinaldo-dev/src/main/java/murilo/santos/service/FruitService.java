package murilo.santos.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import murilo.santos.model.Fruit;
import murilo.santos.repository.FruitRepository;

import java.util.List;

@ApplicationScoped
public class FruitService {

    @Inject
    FruitRepository fruitRepository;

    public List<Fruit> listFruits() {
        List<Fruit> fruits = fruitRepository.listAll();
        return fruits;
    }

    public void insertFruit(){

        Fruit fruit = new Fruit();
        fruit.nome = "Maça";
        fruit.qtd = 10;

        fruitRepository.persist(fruit);

    }


}
