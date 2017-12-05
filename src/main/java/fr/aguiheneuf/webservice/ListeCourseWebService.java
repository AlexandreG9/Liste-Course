package fr.aguiheneuf.webservice;

import fr.aguiheneuf.model.ListeCourse;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

/**
 * Created by Alexandre on 05/12/2017.
 */

@RequestMapping("/liste-course")
public interface ListeCourseWebService {

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    Iterable<ListeCourse> getFullListeCourse();

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
    ListeCourse saveListeCourse(@RequestParam(name = "liste-course") ListeCourse liste);

    @GetMapping("/{id}")
    ListeCourse findById(@PathVariable Long id);
}
