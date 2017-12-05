package fr.aguiheneuf.dao;

import fr.aguiheneuf.model.ListeCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alexandre on 05/12/2017.
 */
@Transactional
public interface ListeCourseDao extends CrudRepository<ListeCourse, Long> {

}
