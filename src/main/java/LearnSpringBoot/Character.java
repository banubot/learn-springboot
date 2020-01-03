package LearnSpringBoot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* Defines a table in our database
 * Should match exactly and have getters/setters
 */
@Entity
@Table (name = "characters") //name of table
public class Character {
    @Id
    @Column (name = "id") //name of column in table
    private Long id;
    @Column (name = "name")
    private String name;
    @Column (name = "species")
    private String species;
    @Column (name = "level")
    private Integer level;

    //getters
    public Integer getLevel() { return level; }
    public String getName() { return name; }
    public Long getId() { return id; }
    public String getSpecies() { return species; }

    //setters
    public void setLevel(Integer level) { this.level = level; }
    public void setSpecies(String species) { this.species = species; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
