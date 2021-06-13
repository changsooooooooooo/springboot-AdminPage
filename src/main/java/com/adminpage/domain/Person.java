package com.adminpage.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RequiredArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private int age;

    private String hobby;

    private String bloodType;

    private String address;

    private LocalDate birthday;

    private String job;

    private String phoneNUmber;

    @Override
    public boolean equals(Object o) {
        if(o==null){
            return false;
        }

        Person person = (Person)o;

        return person.getName() == name;
    }

    @Override
    public int hashCode(){
        return (name+age).hashCode();
    }

}
