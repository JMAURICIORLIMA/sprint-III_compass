package br.com.compass.uol.pb2022.controller;

import br.com.compass.uol.pb2022.dto.StateDto;
import br.com.compass.uol.pb2022.model.State;
import br.com.compass.uol.pb2022.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/states")
public class StateController {

    @Autowired
    StateService service;

    @GetMapping("/findregion/{region}")
    public ResponseEntity<List<StateDto>> filterByRegion(@PathVariable(value = "region") String region){
        return new ResponseEntity<>(service.filterByRegionState(region), HttpStatus.OK);
    }

    @GetMapping("/population")
    public ResponseEntity<List<StateDto>> filterByMaxPopulation(){
        return new ResponseEntity<>(service.largestPopulation(), HttpStatus.OK);
    }

    @GetMapping("/maxarea")
    public ResponseEntity<List<StateDto>> filterByMaxArea(){
        return new ResponseEntity<>(service.maxArea(), HttpStatus.OK);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StateDto> listAll(){
        return service.findAllStates();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StateDto listById(@PathVariable(value = "id") Long id){
        return  service.findByIdState(id);
    }

    @PostMapping
    public ResponseEntity<String> creationState(@RequestBody State state){
        return new ResponseEntity<>(service.create(state), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String updateState(@PathVariable(value = "id") Long id, @RequestBody State state){
        return service.updateState(id, state);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteStateById(@PathVariable(value = "id") Long id){
        return service.deleteByIdState(id);
    }
}
