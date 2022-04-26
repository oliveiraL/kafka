package br.com.example.broker.consumer.model;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@Document("Item")
public class Item {
    @Id
    private String id;

    private String name;
    private int quantity;
    private String category;
}
