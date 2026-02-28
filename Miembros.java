public class Miembros {
    private String nombre;
    private Integer ingresos;
    private Integer gastosPersonales;
    private Integer aporteHogar;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIngresos() {
        return ingresos;
    }

    public void setIngresos(Integer ingresos) {
        this.ingresos = ingresos;
    }

    public Integer getGastosPersonales() {
        return gastosPersonales;
    }

    public void setGastosPersonales(Integer gastosPersonales) {
        this.gastosPersonales = gastosPersonales;
    }

    public Integer getAporteHogar() {
        return aporteHogar;
    }

    public void setAporteHogar(Integer aporteHogar) {
        this.aporteHogar = aporteHogar;
    }

    public Miembros(String nombre, Integer ingresos, Integer gastosPersonales, Integer aporteHogar) {
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.gastosPersonales = gastosPersonales;
        this.aporteHogar = aporteHogar;
    }

    public void finanzasPersona(){
        System.out.println("Calcular finanzas");
    }
}
