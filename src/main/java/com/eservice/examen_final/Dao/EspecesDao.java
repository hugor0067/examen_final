
package com.eservice.examen_final.Dao;


import com.eservice.examen_final.Model.Espaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecesDao extends CrudRepository<EspecesDao, Integer> {


}