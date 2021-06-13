package com.adminpage.service;

import com.adminpage.domain.Block;
import com.adminpage.domain.Person;
import com.adminpage.repository.BlockRepository;
import com.adminpage.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private BlockRepository blockRepository;

    public List<Person> getPeopleExcludeBlocks(){
        List<Person> people = personRepository.findAll();
        List<Block> blocks = blockRepository.findAll();
        List<String> blockNames = blocks.stream().map(Block::getName).collect(Collectors.toList());

        return people.stream()
                .filter(x->!blockNames.contains(x.getName()))
                .collect(Collectors.toList());
    }
}
