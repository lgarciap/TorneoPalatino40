public class Equipo {
    private String nombre;
    private int goles;
    private int lugar;
    private int tirosEsquina;
    private int ganados;
    private int perdidos;
    private int tirosAgol;
    private int amarillas;
    private int rojas;
    private int faltas;

    /**
     * Default constructor
     */
    public Equipo() {
        nombre = "";
        goles = 0;
        lugar = 0;
        tirosEsquina = 0;
        ganados = 0;
        perdidos = 0;
        tirosAgol = 0;
        amarillas = 0;
        rojas = 0;
        faltas = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return this.goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getLugar() {
        return this.lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public int getTirosEsquina() {
        return this.tirosEsquina;
    }

    public void setTirosEsquina(int tirosEsquina) {
        this.tirosEsquina = tirosEsquina;
    }

    public int getGanados() {
        return this.ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return this.perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getTirosAgol() {
        return this.tirosAgol;
    }

    public void setTirosAgol(int tirosAgol) {
        this.tirosAgol = tirosAgol;
    }

    public int getAmarillas() {
        return this.amarillas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public int getRojas() {
        return this.rojas;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }

    public int getFaltas() {
        return this.faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
   
   @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            "\ngoles='" + getGoles() + "'" +
            "\nlugar='" + getLugar() + "'" +
            "\ntirosEsquina='" + getTirosEsquina() + "'" +
            "\nganados='" + getGanados() + "'" +
            "\nperdidos='" + getPerdidos() + "'" +
            "\ntirosAgol='" + getTirosAgol() + "'" +
            "\namarillas='" + getAmarillas() + "'" +
            "\nrojas='" + getRojas() + "'" +
            "\nfaltas='" + getFaltas() + "'" +
            "}";
    }
}
