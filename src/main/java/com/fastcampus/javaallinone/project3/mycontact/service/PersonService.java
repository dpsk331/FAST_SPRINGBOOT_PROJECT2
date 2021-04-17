package com.fastcampus.javaallinone.project3.mycontact.service;

import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import com.fastcampus.javaallinone.project3.mycontact.repositroy.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPeopleExcludeBlocks(){
//        List<Person> people = personRepository.findAll();
//
//        return people.stream().filter(person -> person.getBlock() == null).collect(Collectors.toList());

        // ▼ personRepository에 List<Person> findByBlockIsNull(); 을 작성했기 때문에 아래 문장으로 위의 문장 대체 가능
        return personRepository.findByBlockIsNull();
    }

    public List<Person> getPeopleByName(String name) {
//        List<Person> people = personRepository.findAll();
//
//        return people.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());

        // ▼ personRepository에 List<Person> findByName(String name); 을 작성했기 때문에 아래 문장으로 위의 문장 대체 가능
        return personRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    public Person getPerson(Long id) {
        Person person = personRepository.findById(id).get();

//        System.out.println("person : " + person); // 모든 로그 출력..
        log.info("person : {}", person); // production에 배포가 되었을 때 logback을 이용해 로그 출력 제한 가능

        return person;
    }
}
