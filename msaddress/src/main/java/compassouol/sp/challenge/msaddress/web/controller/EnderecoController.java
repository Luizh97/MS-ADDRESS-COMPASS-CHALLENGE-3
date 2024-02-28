package compassouol.sp.challenge.msaddress.web.controller;

import compassouol.sp.challenge.msaddress.client.ViaCepClient;
import compassouol.sp.challenge.msaddress.entity.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnderecoController {
    private final ViaCepClient viaCepClient;

    @GetMapping("/{cep}")
    public Endereco buscarCep (@PathVariable String cep){
        return viaCepClient.buscarEndereco(cep);
    }
}
