package com.fastcampus.javaallinone.project3.mycontact.repositroy;

import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> { // <EntityType, IdType>

}
