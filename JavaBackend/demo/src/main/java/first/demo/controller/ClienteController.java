package first.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import first.demo.models.ClienteEntity;
import first.demo.services.ClienteService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/ativ1", method = RequestMethod.GET)
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    @ResponseBody
    public Iterable<ClienteEntity> getClientes() {
        return clienteService.getAll();
    }

    @GetMapping("/clientes/{id}")
    @ResponseBody
    public ClienteEntity getClientePath(@PathVariable("id") String id) {
        return clienteService.findById(id);
    }

}
