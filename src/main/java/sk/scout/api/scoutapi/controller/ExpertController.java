package sk.scout.api.scoutapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.scout.api.scoutapi.data.program.expert.Expert;
import sk.scout.api.scoutapi.data.program.Program;
import sk.scout.api.scoutapi.repository.ExpertRepository;
import sk.scout.api.scoutapi.request.ExpertJsonRequest;

import java.util.Optional;

@RequestMapping("/program/expert")
@RestController
public class ExpertController {

    @Autowired
    ExpertRepository expertRepository;

    @GetMapping()
    public Iterable<Expert> getAllExperts(){
        return expertRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Expert> getExpertById(@PathVariable("id") Integer id){
        return expertRepository.findById(id);
    }

    @PutMapping()
    public Program addExpert(@RequestBody ExpertJsonRequest request){
        Expert newExpert = new Expert(request);
        expertRepository.save(newExpert);
        return newExpert;
    }

    @DeleteMapping("/{id}")
    public void deleteExpertById(@PathVariable("id") Integer id){
        expertRepository.deleteById(id);
    }
}
