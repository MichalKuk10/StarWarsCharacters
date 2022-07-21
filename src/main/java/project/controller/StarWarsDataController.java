package project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.dto.CharacterResponse;
import project.model.Character;
import project.service.CharacterService;
import project.service.SwapiRestClient;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static project.controller.CharacterApiDefinition.*;

@RestController
@RequestMapping(value = RESOURCE_ROOT, produces = APPLICATION_JSON_VALUE)
public class StarWarsDataController {

    private final CharacterService characterService;
    private final SwapiRestClient swapiRestClient;

    public StarWarsDataController(CharacterService characterService, SwapiRestClient swapiRestClient) {
        this.characterService = characterService;
        this.swapiRestClient = swapiRestClient;
    }

    @PostMapping(value = IMPORT_SWAPI_BY_ID)
    public ResponseEntity<String> getStarWarsCharacter(@PathVariable Long id) {
        Character starWarsCharacter = swapiRestClient.getStarWarsCharacter(id);
        characterService.saveCharacter(starWarsCharacter);
        return ResponseEntity.status(CREATED).body("New Character has been added to database.");
    }

    @GetMapping(value = IMPORT_LOCAL_BY_ID)
    public CharacterResponse getCharacterById(@PathVariable Long id) {
        return characterService.getCharacterById(id);
    }

    @GetMapping(value = IMPORT_LOCAL_BY_NAME)
    public List<CharacterResponse> getCharacterByName(@PathVariable String name) {
        return characterService.getCharacterByName(name);
    }

}
