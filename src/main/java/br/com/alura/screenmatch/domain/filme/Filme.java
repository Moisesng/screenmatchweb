package br.com.alura.screenmatch.domain.filme;

import jakarta.persistence.*;

@Entity
@Table(name = "filmes")
public class Filme {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Column(name= "duracao_em_minutos")
    private Integer duracaoEmMinutos;
    @Column(name= "ano_lancamento")
    private Integer anoDeLancamento;
    private String genero;


    public Filme(){

    }

    public Filme(DadosCadastroFilme dados){
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoDeLancamento = dados.ano();
        this.genero = dados.genero();
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracaoEmMinutos +
                ", ano=" + anoDeLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void atualizaDados(DadosalteraFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos= dados.duracao();
        this.anoDeLancamento= dados.ano();
        this.genero= dados.genero();
    }
}
