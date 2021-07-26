package sk.scout.api.scoutapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.scout.api.scoutapi.data.Expert;
import sk.scout.api.scoutapi.data.Program;
import sk.scout.api.scoutapi.repository.ExpertRepository;
import sk.scout.api.scoutapi.request.ExpertJsonRequest;

import java.util.Optional;

@RequestMapping("/program/expert")
@RestController
public class ExpertController {

    @Autowired
    ExpertRepository expertRepository;

    @GetMapping("/{id}")
    public Optional<Expert> getExpertById(@PathVariable("id") Integer id){
        return expertRepository.findById(id);
    }

    @GetMapping()
    public Iterable<Expert> getAllExperts(){
        return expertRepository.findAll();
    }

    @PostMapping()
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
