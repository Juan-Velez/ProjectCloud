package co.com.poli.talleruno.tallerunocloud.controller;

import co.com.poli.talleruno.tallerunocloud.entities.Backlog;
import co.com.poli.talleruno.tallerunocloud.services.BacklogService;
import co.com.poli.talleruno.tallerunocloud.services.ProjectService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/backlog")

//@RequiredArgsConstructor
public class BacklogController {

    @Autowired
    private BacklogService  backlogService;
    //private final BacklogService backlogService;

    @GetMapping
    List<Backlog> findAllBacklog(){
        return backlogService.findAllBacklog();
    }

    @PostMapping
    Backlog save(Backlog backlog){
        return  backlogService.save(backlog);
    }



    


/*
    private final ProjectService projectService;
    private final ResponseBuilder builder;

    @PostMapping
    public Response save(@Valid @RequestBody Customer customer, BindingResult result){
        if(result.hasErrors()){
            return builder.failed(this.formatMessage(result));
        }
        customerService.save(customer);
        return builder.success(customer);
    }
    @DeleteMapping("/{numberID}")
    public Response delete(@PathVariable("numberID") String numberID){
        Customer customer = (Customer) findByNumberID(numberID).getData();
        if(customer==null){
            return builder.failed("Not found");
        }
        return builder.success(customer);
    }

    @GetMapping
    public Response findAll(){
        return builder.success(customerService.findAll());
    }

    @GetMapping("/{numberID}")
    public Response findByNumberID(@PathVariable("numberID") String numberID){
        return builder.success(customerService.findByNumberID(numberID));
    }

    private String formatMessage( BindingResult result){
        List<Map<String,String>> errors = result.getFieldErrors().stream()
                .map(err-> {
                    Map<String,String> error = new HashMap<>();
                    error.put(err.getField(),err.getDefaultMessage());
                    return error;
                }).collect(Collectors.toList());
        ErrorMessage errorMessage = ErrorMessage.builder()
                .messages(errors)
                .build();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        try{
            json = objectMapper.writeValueAsString(errorMessage);
        }catch (JsonProcessingException ex){
            ex.printStackTrace();
        }
        return json;
    } */
}
