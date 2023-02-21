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
@Document(collection = "shifts")
public class Shifts {
    private String type;
    private Integer start;
    private  Integer duration;
    private Integer break_;


}
