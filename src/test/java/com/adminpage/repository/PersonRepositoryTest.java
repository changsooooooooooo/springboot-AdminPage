package com.adminpage.repository;

import com.adminpage.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import org.assertj.core.api.Assertions;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void crud(){
        Person person = new Person();
        person.setName("martin");
        person.setAge(10);

        personRepository.save(person);

        List<Person> personList = personRepository.findAll();

        Assertions.assertThat(personList.size()).isEqualTo(1);
        Assertions.assertThat(personList.get(0).getName()).isEqualTo("martin");
        Assertions.assertThat(personList.get(0).getAge()).isEqualTo(10);
    }

}
