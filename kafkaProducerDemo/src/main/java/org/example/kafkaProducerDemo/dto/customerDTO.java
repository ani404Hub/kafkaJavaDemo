package org.example.kafkaProducerDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class customerDTO {

    private  int id;
    private String name;
    private String email;
    private String contactNo;
}
