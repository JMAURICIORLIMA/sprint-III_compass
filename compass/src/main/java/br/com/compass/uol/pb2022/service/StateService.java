package br.com.compass.uol.pb2022.service;

import br.com.compass.uol.pb2022.dto.StateDto;
import br.com.compass.uol.pb2022.exception.BaseException;
import br.com.compass.uol.pb2022.model.State;
import br.com.compass.uol.pb2022.repository.StateRepository;
import br.com.compass.uol.pb2022.util.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StateService extends StateServiceFilter{

    @Autowired
    StateRepository estadoRepository;

    public String create(State state){
        try{
            Util.verificationState(state.getRegiao());
            Util.yearsCheck(state.getDataDeFundacao(), state.getTempoDesdeFundacao());
            estadoRepository.save(state);
            return "State successfully created";
        }catch (BaseException e){
            return e.getMessage();
        }
    }

    public List<StateDto> findAllStates(){
        List<State> states = estadoRepository.findAll();
        return states.stream().map(obj -> new StateDto(obj)).collect(Collectors.toList());
    }

    public StateDto findByIdState(Long id){
        Optional<State> state = estadoRepository.findById(id);
        return new StateDto(state.get());
    }

    public String updateState(Long id, State state) {
        Optional<State> verificationExistState = estadoRepository.findById(id);
        if (verificationExistState.isPresent()){
            try {
                Util.verificationState(state.getRegiao());
                Util.yearsCheck(state.getDataDeFundacao(), state.getTempoDesdeFundacao());
                BeanUtils.copyProperties(state, verificationExistState.get());
                final State updateState = verificationExistState.get();
                estadoRepository.save(updateState);
                return "Update successfully performed";
            }catch (BaseException e){
                return e.getMessage();
            }
        }
        throw new BaseException("The state whose id = "+id+" could not be updated");
    }

    public String deleteByIdState(Long id){
        Optional<State> findState = estadoRepository.findById(id);
        if(findState.isPresent()){
            estadoRepository.deleteById(id);
            return "successfully deleted";
        }
        throw new BaseException("Informed id: "+id+" does not contain data");
    }
}
