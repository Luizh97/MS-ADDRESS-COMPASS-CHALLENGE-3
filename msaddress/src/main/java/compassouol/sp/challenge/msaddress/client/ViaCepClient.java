package compassouol.sp.challenge.msaddress.client;

import compassouol.sp.challenge.msaddress.entity.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepClient {
    @GetMapping("/{cep}/json")
    Endereco buscarEndereco(@PathVariable("cep") String cep);

}
