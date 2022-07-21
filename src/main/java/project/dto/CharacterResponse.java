package project.dto;

public final class CharacterResponse {

    private Long characterId;
    private String name;
    private Integer height;
    private Integer mass;

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public String getName() {
        return name;
    }

    public Integer getMass() {
        return mass;
    }

}
