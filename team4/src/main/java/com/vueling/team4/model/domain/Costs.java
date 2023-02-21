package com.vueling.team4.model.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "costs")
public class Costs {
    private String type;
    private double cord;
    private  double equipaje;
    private double jardinera;

}
