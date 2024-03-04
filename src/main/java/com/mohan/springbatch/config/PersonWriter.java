package com.mohan.springbatch.config;

import com.mohan.springbatch.model.Person;
import com.mohan.springbatch.repository.PersonRepository;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonWriter implements ItemWriter<Person> {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public void write(Chunk<? extends Person> chunk) throws Exception {
    personRepository.saveAll(chunk);
    }
}
