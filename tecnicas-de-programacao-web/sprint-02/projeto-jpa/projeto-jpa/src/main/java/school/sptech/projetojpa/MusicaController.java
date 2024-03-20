package school.sptech.projetojpa;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("musicas")
public class MusicaController {

    @Autowired
    private MusicaRepository musicaRepository;

    @PostMapping
    public ResponseEntity<Musica> criar(@RequestBody Musica novaMusica){
        Musica musicaSalva = musicaRepository.save(novaMusica);
        return ResponseEntity.status(200).body(musicaSalva);
    }
}
