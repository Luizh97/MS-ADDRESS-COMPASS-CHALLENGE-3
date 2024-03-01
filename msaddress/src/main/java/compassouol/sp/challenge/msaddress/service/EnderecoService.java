package compassouol.sp.challenge.msaddress.service;

import compassouol.sp.challenge.msaddress.entity.Endereco;
import compassouol.sp.challenge.msaddress.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;


    public void salvarEndereco(Endereco endereco) {
         enderecoRepository.save(endereco);

    }

    public void validarEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new RuntimeException("Endereço não encontrado");
        }
    }
}
