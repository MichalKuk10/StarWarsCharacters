package validator;

import org.junit.Test;
import org.mockito.Mock;
import project.validation.CharacterValidator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CharacterServiceTest {
    @Mock
    private CharacterValidator characterValidator;

    @Test
    public void shouldReturnTrueWhenHeightAboveMin(){
        //given
        int height = 175;
        //when
        //then
        assertTrue(characterValidator.hasMinHeight(height));
    }

    @Test
    public void shouldReturnFalseWhenHeightBelowMin(){
        //given
        int height = 165;
        //when
        //then
        assertFalse(characterValidator.hasMinHeight(height));
    }


}
