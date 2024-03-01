package compassouol.sp.challenge.msaddress.repository;

import compassouol.sp.challenge.msaddress.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
