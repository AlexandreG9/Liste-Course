package fr.aguiheneuf.webservice.impl;

import fr.aguiheneuf.dao.ListeCourseDao;
import fr.aguiheneuf.model.ListeCourse;
import fr.aguiheneuf.webservice.ListeCourseWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by Alexandre on 05/12/2017.
 */
@RestController
public class ListeCourseWebServiceImpl implements ListeCourseWebService{
    Logger logger = Logger.getLogger(ListeCourseWebServiceImpl.class.getName());

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

    @Override
    public ListeCourse findById(@PathVariable Long id) {
        logger.info("Valeur id = " + id);
        return listeCourseDao.findOne(id);
    }
}
