package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.model.Character;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    List<Character> findCharacterByNameContainingIgnoreCase(String name);
}
