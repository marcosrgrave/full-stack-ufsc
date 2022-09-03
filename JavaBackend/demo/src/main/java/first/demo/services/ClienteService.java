package first.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first.demo.repositories.ClienteRepository;
import first.demo.models.ClienteEntity;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Iterable<ClienteEntity> getAll() {
        return clienteRepository.findAll();
    }

    public ClienteEntity findById(String id) {
        return clienteRepository.findById(id).get();
    }

}
