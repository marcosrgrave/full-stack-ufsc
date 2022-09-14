package first.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first.demo.entities.ClienteEntity;
import first.demo.repositories.ClienteRepository;

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

    public void addCliente(String name) {
        clienteRepository.save(new ClienteEntity(name));
    }

    public void addCliente(ClienteEntity cliente) {
        clienteRepository.save(cliente);
    }

    public void updateCliente(String id, String numero) {
        ClienteEntity cliente = clienteRepository.findById(id).get();
        cliente.setNumero(numero);
        this.addCliente(cliente);
    }

}
