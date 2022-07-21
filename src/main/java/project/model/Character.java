package project.model;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "characterid")
    private Long characterId;
    private String name;
    private Integer height;
    private Integer mass;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

}
