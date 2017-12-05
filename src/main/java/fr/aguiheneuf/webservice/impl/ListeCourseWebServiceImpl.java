package fr.aguiheneuf.webservice.impl;

import fr.aguiheneuf.dao.ListeCourseDao;
import fr.aguiheneuf.model.ListeCourse;
import fr.aguiheneuf.webservice.ListeCourseWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Alexandre on 05/12/2017.
 */
@RestController
public class ListeCourseWebServiceImpl implements ListeCourseWebService{
    @Autowired
    private ListeCourseDao listeCourseDao;

    @Override
    public Iterable<ListeCourse> getFullListeCourse() {
        return listeCourseDao.findAll();
    }

    @Override
    public ListeCourse saveListeCourse(ListeCourse liste) {
        return listeCourseDao.save(liste);
    }
}
