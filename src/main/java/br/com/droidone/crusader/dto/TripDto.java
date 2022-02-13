package br.com.droidone.crusader.dto;

import br.com.droidone.crusader.model.Trip;
import lombok.Data;

@Data
public class TripDto {
    private String username;
    private String title;
    private String description;
    private String country;
    private String date;

    public Trip toEntity() {
        Trip entity = new Trip();
        entity.setUsername(this.username);
        entity.setTitle(this.title);
        entity.setDescription(this.description);
        entity.setCountry(this.country);
        entity.setDate(this.date);
        return entity;
    }
}
