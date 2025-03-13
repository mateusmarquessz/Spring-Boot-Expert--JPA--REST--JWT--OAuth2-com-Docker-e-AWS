package io.github.mateusmarquessz.arquiteturasspring.montadora;

public class Motor {
    private String model;
    private Integer cavalos;
    private Integer cilindos;
    private Double litragem;
    private TipoMotor tipo;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getCilindos() {
        return cilindos;
    }

    public void setCilindos(Integer cilindos) {
        this.cilindos = cilindos;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model='" + model + '\'' +
                ", cavalos=" + cavalos +
                ", cilindos=" + cilindos +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                '}';
    }
}
