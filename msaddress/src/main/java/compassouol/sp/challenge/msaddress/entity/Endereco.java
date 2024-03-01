package compassouol.sp.challenge.msaddress.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    @NotBlank(message = "Logradouro is required")
    private String logradouro;
    @NotBlank(message = "Número is required")
    private String complemento;
    @NotBlank(message = "Bairro is required")
    private String bairro;
    @NotBlank(message = "Localidade is required")
    private String localidade;
    @NotBlank(message = "UF is required")
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    @Column(name = "id_usuario")
    private Long idUsuario;

}

