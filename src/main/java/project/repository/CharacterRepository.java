package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Character;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
