package med.voll.api.controller;

import jakarta.transaction.Transactional;
import med.voll.api.medico.MedicoDados;
import med.voll.api.medico.MedicoEntity;
import med.voll.api.medico.MedicoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medico")
public class medicosController {

    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody MedicoDados dados) {
        repository.save(new MedicoEntity(dados));
    }
}
