package fr.aguiheneuf.webservice;

import fr.aguiheneuf.model.ListeCourse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.core.MediaType;

/**
 * Created by Alexandre on 05/12/2017.
 */

public interface ListeCourseWebService {

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    Iterable<ListeCourse> getFullListeCourse();

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
    ListeCourse saveListeCourse(@RequestParam(name = "liste-course", required = true) ListeCourse liste);
}
