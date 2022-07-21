package project.service;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import project.model.Character;

@Component
public class SwapiRestClient {

    public Character getStarWarsCharacter(Long id){
        return WebClient.create()
                .get()
                .uri("https://swapi.dev/api/people/" + id + "/")
                .retrieve()
                .bodyToMono(Character.class)
                .block();
    }

}
