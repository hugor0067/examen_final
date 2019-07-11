package com.eservice.examen_final.Controller;


import com.eservice.examen_final.Dao.EspecesDao;
import com.eservice.examen_final.Model.Espaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/Espaces")
public class EspacesController {

    @Autowired
    private EspecesDao poissonsDao;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewEspeces(@RequestParam String nom ,
                         @RequestParam int id, @RequestParam String description)
    {
        Espaces p = new Espaces();
        p.setNom(nom);
        p.setId(id);
        p.getDescription(description);
        EspecesDao.save(p);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<EspecesDao> getAllUsersPoissons() {
        return  Espaces.findAll();
    }
}




}
