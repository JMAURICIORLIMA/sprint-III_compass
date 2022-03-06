package br.com.compass.uol.pb2022.service;

import br.com.compass.uol.pb2022.dto.StateDto;
import br.com.compass.uol.pb2022.exception.BaseException;
import br.com.compass.uol.pb2022.model.State;
import br.com.compass.uol.pb2022.repository.StateRepository;
import br.com.compass.uol.pb2022.util.Util;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class StateServiceFilter {

    @Autowired
    StateRepository estadoRepository;

    public List<StateDto> filterByRegionState(String region)  {
        Util.verificationState(region);
        List<State> findStateByRegion = estadoRepository.findByRegion(region);
        if (!findStateByRegion.isEmpty()) {
            return findStateByRegion.stream().map(obj -> new StateDto(obj)).collect(Collectors.toList());
        }

        throw new BaseException("Region not found");
    }

    public List<StateDto> largestPopulation(){
        List<State> states = estadoRepository.findByLargestPopulation();
        return states.stream().map(obj -> new StateDto(obj)).collect(Collectors.toList());
    }

    public List<StateDto> maxArea(){
         List<State> states = estadoRepository.findByMaxArea();
        return states.stream().map(obj -> new StateDto(obj)).collect(Collectors.toList());
    }
}
