package LearnSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/* Creates REST endpoints
 * Lets another application interface with us
 */
@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    private CharacterService service;

    /* get every character
     */
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Character> getAll() {
        return service.getAll();
    }

    /* get every character above a level
     */
    @RequestMapping(value = "/level/{level}", method = RequestMethod.GET)
    public Iterable<Character> getAllAboveLevel(@PathVariable Integer level) {
        return service.getAboveLevel(level);
    }

    /* delete a character by their id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        service.delete(id);
    }

    /* create/update a character
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void add(@RequestBody Character character) {
        service.add(character);
    }
}


