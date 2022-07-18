package project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static project.controller.CharacterApiDefinition.IMPORT_BY_ID;
import static project.controller.CharacterApiDefinition.RESOURCE_ROOT;

@RestController
@RequestMapping(value = RESOURCE_ROOT, produces = "application/json")
public class StartWarsDataController {

    @GetMapping(value = IMPORT_BY_ID)
    public Character getCharacter(){

        return null;

    }
}
