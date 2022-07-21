package project.mapper;

import org.springframework.stereotype.Component;
import project.dto.CharacterResponse;
import project.model.Character;

@Component
public class CharacterMapper {

    public CharacterResponse mapToCharacterDto(Character character){
        CharacterResponse characterResponse = new CharacterResponse();
        characterResponse.setCharacterId(character.getCharacterId());
        characterResponse.setHeight(character.getHeight());
        characterResponse.setMass(character.getMass());
        characterResponse.setName(character.getName());

        return characterResponse;
    }

}
