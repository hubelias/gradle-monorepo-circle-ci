package dev.hubelias.myproject.client;

import dev.hubelias.myproject.api.PersonDto;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

class PeopleClient {
    private final RestTemplate restTemplate;

    PeopleClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    PersonDto getPerson(Long id) {
        return restTemplate.getForEntity(URI.create("server.url"), PersonDto.class).getBody();
    }
}
