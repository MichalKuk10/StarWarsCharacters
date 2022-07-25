package project.service;

import org.springframework.stereotype.Service;
import project.dto.CharacterResponse;
import project.exception.CannotFindCharacterException;
import project.mapper.CharacterMapper;
import project.model.Character;
import project.repository.CharacterRepository;
import project.validation.CharacterValidator;

import java.util.List;
import static java.util.stream.Collectors.toList;

@Service
public class CharacterService {

    private final CharacterRepository repository;
    private final CharacterMapper mapper;
    private final CharacterValidator validator;

    public CharacterService(final CharacterRepository repository,
                            final CharacterMapper mapper,
                            final CharacterValidator validator) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
    }

    public void saveCharacter(Character character){
        repository.save(character);
    }

    public CharacterResponse getCharacterById(Long id){
        Character character = repository
                .findById(id)
                .filter(champ -> validator.hasMinHeight(champ.getHeight()))
                .orElseThrow(CannotFindCharacterException::new);

        return mapper.mapToCharacterDto(character);
    }

    public List<CharacterResponse> getCharacterByName(String name){
        List<Character> charactersList = repository.findCharacterByNameContainingIgnoreCase(name);
        isEmptyList(charactersList);

        return charactersList
                .stream()
                .filter(champ -> validator.hasMinHeight(champ.getHeight()))
                .map(mapper::mapToCharacterDto)
                .collect(toList());
    }

    private void isEmptyList(List<Character> list) {
        if(list.isEmpty()){
            throw new CannotFindCharacterException();
        }
    }

}
