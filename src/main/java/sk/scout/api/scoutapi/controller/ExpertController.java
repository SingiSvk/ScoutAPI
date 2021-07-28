package sk.scout.api.scoutapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.scout.api.scoutapi.data.program.Program;
import sk.scout.api.scoutapi.data.program.expert.Expert;
import sk.scout.api.scoutapi.repository.ExpertRepository;
import sk.scout.api.scoutapi.request.ExpertJsonRequest;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost")
@RequestMapping("/program/expert")
@RestController
public class ExpertController {

    @Autowired
    ExpertRepository expertRepository;

    @GetMapping()
    public Iterable<Expert> getAllExperts(){
        return expertRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
    }

    @GetMapping("/{id}")
    public Optional<Expert> getExpertById(@PathVariable("id") Integer id){
        return expertRepository.findById(id);
    }

    @PutMapping()
    public ResponseEntity<Program> addExpert(@RequestBody ExpertJsonRequest request){
        Expert newExpert = new Expert(request);
        try{
            expertRepository.save(newExpert);
        }catch (Exception e){
            return new ResponseEntity<>(newExpert, HttpStatus.NOT_ACCEPTABLE);
        }

        return new ResponseEntity<>(newExpert, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteExpertById(@PathVariable("id") Integer id){
        expertRepository.deleteById(id);
    }
}
