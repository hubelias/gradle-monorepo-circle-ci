package dev.hubelias.myproject.people;

import dev.hubelias.myproject.api.PersonDto;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
    public PersonDto getPersonById(Long personId) {
        return new PersonDto("Hubert Elias", 32);
    }
}
