public class Veiculo {
    public String modelo;
    public String Fabricante;
    public int AnoFabricao;
    public int placa;
    public boolean Status;

    public Veiculo(String modelo, String fabricante, int anoFabricao, int placa, boolean status) {
        this.modelo = modelo;
        this.Fabricante = fabricante;
        this.AnoFabricao = anoFabricao;
        this.placa = placa;
        this.Status = status;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return Fabricante;
    }
    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    public int getAnoFabricao() {
        return AnoFabricao;
    }
    public void setAnoFabricao(int anoFabricao) {
        AnoFabricao = anoFabricao;
    }

    public boolean isStatus() {
        return Status;
    }
    public void setStatus(boolean status) {
        Status = status;
    }

    public int getPlaca() {
        return placa;
    }
    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void CadastrarVeiculo(){
        System.out.println("Qual veiculo voce quer cadastrar?");

    };
}
