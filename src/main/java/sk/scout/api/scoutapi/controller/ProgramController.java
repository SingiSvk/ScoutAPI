package sk.scout.api.scoutapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.scout.api.scoutapi.data.Expert;
import sk.scout.api.scoutapi.data.Program;
import sk.scout.api.scoutapi.repository.ExpertRepository;
import sk.scout.api.scoutapi.request.ExpertJsonRequest;

import java.util.Optional;

@RequestMapping("/program")
@RestController
public class ProgramController {

    @Autowired
    ExpertRepository expertRepository;

    @GetMapping("/expert/{id}")
    public Optional<Expert> getExpertById(@PathVariable("id") Integer id){
        return expertRepository.findById(id);
    }

    @GetMapping("/expert/list")
    public Iterable<Expert> getAllExperts(){
        return expertRepository.findAll();
    }

    @PostMapping("/expert")
    public Program addExpert(@RequestBody ExpertJsonRequest request){
        Expert newExpert = new Expert(request);
        expertRepository.save(newExpert);
        return newExpert;
    }

    @DeleteMapping("/expert/{id}")
    public void deleteExpertById(@PathVariable("id") Integer id){
        expertRepository.deleteById(id);
    }
}
