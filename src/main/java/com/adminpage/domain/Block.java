package com.adminpage.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Block {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String reason;

    private LocalDate startDate;

    private LocalDate endDate;


}
