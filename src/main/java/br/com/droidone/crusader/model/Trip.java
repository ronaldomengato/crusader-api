package br.com.droidone.crusader.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Trip")
@Data
public class Trip {
    @Id
    private String id;
    @Indexed
    private String username;
    private String title;
    private String description;
    private String country;
    private String date;
}
