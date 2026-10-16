package med.voll.api.controller;

import jakarta.transaction.Transactional;
import med.voll.api.medico.MedicoDados;
import med.voll.api.medico.MedicoEntity;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class medicosController {

    @Autowired
    private final MedicoRepository repository;

    public medicosController(MedicoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody MedicoDados dados) {
        repository.save(new MedicoEntity(dados));
    }

    @GetMapping
    public List<MedicoEntity> listar(){
       return repository.findAll();
    }
}
