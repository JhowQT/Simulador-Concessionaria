package model;

public class Veiculo {
    private Long id; //Não pode ser nulo.
    private String modelo;
    private String fabricante;
    private int anoFabricacao;
    private TipoVeiculo tipo;
    private StatusVeiculo status;

    public Veiculo(Long id, String modelo, String fabricante, int anoFabricacao, TipoVeiculo tipo, StatusVeiculo status) {
        this.id = id;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.tipo = tipo;
        this.status = status;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }
    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public StatusVeiculo getStatus() {
        return status;
    }
    public void setStatus(StatusVeiculo status) {
        this.status = status;
    }

    public void CadastrarVeiculo(){
        System.out.println("Qual veiculo voce quer cadastrar?");

    };
}
