package LearnSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Takes the requests made to the controller and performs
 * desired action, getting data from the repository and sending it back.
 */
@Service
public class CharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    public Iterable<Character> getAll() {
        return characterRepository.findAll();
    }

    public Iterable<Character> getAboveLevel(Integer level) {
        return characterRepository.findByGreaterThanLevel(level);
    }

    public void delete(Long id) {
        characterRepository.deleteById(id);
    }

    public void add(Character character) {
        characterRepository.save(character);
    }
}
