package br.com.example.broker.consumer.repository;

import java.util.List;

import br.com.example.broker.consumer.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {

    @Query("{name:'?0'}")
    Item findItemByName(String name);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<Item> findAll(String category);

    long count();

}