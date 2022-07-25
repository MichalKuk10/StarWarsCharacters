package project.validation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CharacterValidator {

    @Value("${minimum.character.height}")
    private Integer minCharacterHeight;

    public CharacterValidator() {
    }

    public boolean hasMinHeight(Integer height) {
        return height >= minCharacterHeight;
    }

}
