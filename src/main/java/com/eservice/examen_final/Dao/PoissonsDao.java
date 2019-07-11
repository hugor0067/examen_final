
package com.eservice.examen_final.Dao;

import com.eservice.examen_final.Model.Poissons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoissonsDao extends CrudRepository<Poissons, Integer> {

}