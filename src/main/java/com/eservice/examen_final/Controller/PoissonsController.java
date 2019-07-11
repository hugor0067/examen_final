package com.eservice.examen_final.Controller;


import com.eservice.examen_final.Dao.PoissonsDao;
import com.eservice.examen_final.Model.Poissons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/Poisson")
public class PoissonsController {

    @Autowired
    private PoissonsDao poissonsDao;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewPoisson(@RequestParam String nom ,
                         @RequestParam int id, @RequestParam int type, @RequestParam String photo)
    {
        Poissons p = new Poissons();
        p.setNom(nom);
        p.setId(id);
        p.setType(type);
        p.setPhoto(photo);
        PoissonsDao.save(p);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<PoissonsDao> getAllUsersPoissons() {
        return  Poissons.findAll();
    }
}





}
