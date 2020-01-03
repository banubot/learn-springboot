package LearnSpringBoot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/* Repository which is created for us and makes queries to our database
 * Comes with fetching and saving using primary key
 */
@Repository
public interface CharacterRepository extends CrudRepository<Character, Long> {
    //custom query to get all characters whose level is large enough
    @Query(value = "select c from Character c where c.level > :level")
    List<Character> findByGreaterThanLevel(@Param("level") Integer level);
}
