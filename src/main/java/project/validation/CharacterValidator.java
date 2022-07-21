package project.validation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CharacterValidator {

    @Value("${minimum.character.height}")
    private Integer minCharacterHeight;

    public boolean hasMinHeight(Integer height) {
        return height >= minCharacterHeight;
    }

}
