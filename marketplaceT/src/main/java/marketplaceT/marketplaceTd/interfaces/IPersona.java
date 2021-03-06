/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplaceT.marketplaceTd.interfaces;



import java.util.List;
import marketplaceT.marketplaceTd.modelo.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository
public interface IPersona extends JpaRepository<persona, Integer>{
    
     @Query("select p from persona p where p.dni=:dni")
     List<persona> buscarnombre(String dni);

}
