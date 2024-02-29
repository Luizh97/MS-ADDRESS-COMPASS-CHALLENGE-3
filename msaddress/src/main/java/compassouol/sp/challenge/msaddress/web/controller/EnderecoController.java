package compassouol.sp.challenge.msaddress.web.controller;

import compassouol.sp.challenge.msaddress.client.ViaCepClient;
import compassouol.sp.challenge.msaddress.entity.Endereco;
import compassouol.sp.challenge.msaddress.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class EnderecoController {
    private final ViaCepClient viaCepClient;
    private final EnderecoService enderecoService;

    @PostMapping("/{cep}/usuario")
    public void teste(@PathVariable String cep, @RequestBody Long id) {
        System.out.println("Buscando CEP: " + cep);
        System.out.println("Buscando usuário: " + id);
        Endereco endereco = viaCepClient.buscarEndereco(cep);
        endereco.setIdUsuario(id);

        enderecoService.salvarEndereco(endereco);


    }

//    @PostMapping("/usuario")
//    public ResponseEntity<?> buscarUsuario(@RequestBody Usuario user) {
//        Usuario usuario = user;
//        System.out.println("Buscando usuário: " + usuario.getId());
//        return ResponseEntity.ok().build();
//    }
}
