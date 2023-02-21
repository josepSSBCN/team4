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
@Document(collection = "schedule")
public class Schedule {
    private String dt_flight;
     private Integer cd_flight_number;
    private String cd_airport_dep;
    private String cd_airport_arr;
    private String handling_function;
    private String ts_operation_start;
    private String ts_operation_end;
    private Integer required_employees;


}
