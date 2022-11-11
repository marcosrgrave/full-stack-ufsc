package first.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import first.demo.entities.ClienteEntity;
import first.demo.services.ClienteService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/ativ1", method = RequestMethod.GET)
public class ClienteController {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    private String handleMissingParams(MissingServletRequestParameterException parameter) {
        String name = parameter.getParameterName();
        return String.format("Required parameter '%s' is missing", name);
    }

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public Iterable<ClienteEntity> getClientes() {
        return clienteService.getAll();
    }

    @GetMapping("/clientes/{id}")
    public ClienteEntity getClientePath(@PathVariable("id") String id) {
        return clienteService.findById(id);
    }

    @PostMapping("/clientes/add")
    public void addCliente(@RequestParam("nome") String name) {
        clienteService.addCliente(name);
    }

}
