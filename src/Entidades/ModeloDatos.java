package Entidades;



public class ModeloDatos {
    private Integer id;
    private String nombre;
    private Integer codigo;
    private Double debe;
    private Double haber;
    private Integer nasiento;
    private String Fecha;

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setDebe(Double debe) {
        this.debe = debe;
    }

    public void setHaber(Double haber) {
        this.haber = haber;
    }

    public void setNasiento(Integer nasiento) {
        this.nasiento = nasiento;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Double getDebe() {
        return debe;
    }

    public Double getHaber() {
        return haber;
    }

    public Integer getNasiento() {
        return nasiento;
    }

    public String getFecha() {
        return Fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}