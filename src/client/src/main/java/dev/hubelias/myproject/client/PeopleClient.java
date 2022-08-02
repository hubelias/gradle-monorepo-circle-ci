package dev.hubelias.myproject.client;

import dev.hubelias.myproject.api.PersonDto;

class PeopleClient {

    PersonDto getPerson(Long id) {
        return new PersonDto("Hubert Elias", 33);
    }
}
