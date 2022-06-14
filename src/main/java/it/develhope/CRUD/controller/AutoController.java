package it.develhope.CRUD.controller;

import it.develhope.CRUD.entity.Auto;

import it.develhope.CRUD.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/auto")
public class AutoController {

    @Autowired
    private AutoRepository autoRepository;

    @PostMapping("")
    public Auto creaAuto(@RequestBody Auto auto){
        return autoRepository.saveAndFlush(auto);
    }

    @GetMapping("")
    public List<Auto> getAutoList(){
        return autoRepository.findAll();
    }
    @GetMapping("/{id}")
    public Auto getAutoSingola(@PathVariable Long id){

        return autoRepository.existsById(id) ? autoRepository.getReferenceById(id) : new Auto();
    }
    @PutMapping("/{id}")
    public Auto modificaAuto(@PathVariable Long id, @RequestParam String tipo){
        Auto auto;
        if (autoRepository.existsById(id)){
            auto = autoRepository.getReferenceById(id);
            auto.setNomeTipo(tipo);
            auto = autoRepository.saveAndFlush(auto);
        }else{
            auto = new Auto();
        }
        return auto;
    }

    @DeleteMapping("/{id}")
    public void deleteSingolaAuto(@PathVariable long id, HttpServletResponse response){
        if (autoRepository.existsById(id))
            autoRepository.deleteById(id);
        else
            response.setStatus(409);
    }

    @DeleteMapping("")
    public void deleteAllAuto(){
        autoRepository.deleteAll();
    }
}

