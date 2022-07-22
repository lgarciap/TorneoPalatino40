public class Torneo {
    private Equipo equipo1;
    private Equipo equipo2;
    private Equipo equipo3;
    private Equipo equipo4;
    private Equipo equipo5;

    
    /**
     * Default constructor
     */
    public Torneo() {
        equipo1 = new Equipo();
        equipo2 = new Equipo();
        equipo3 = new Equipo();
        equipo4 = new Equipo();
        equipo5 = new Equipo();
    }

    public void setEquipo1(Equipo eq){
        this.equipo1 = eq;
    }

    public Equipo getEquipo1(){
        return equipo1;
    }

    public Equipo getEquipo2() {
        return this.equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Equipo getEquipo3() {
        return this.equipo3;
    }

    public void setEquipo3(Equipo equipo3) {
        this.equipo3 = equipo3;
    }

    public Equipo getEquipo4() {
        return this.equipo4;
    }

    public void setEquipo4(Equipo equipo4) {
        this.equipo4 = equipo4;
    }

    public Equipo getEquipo5() {
        return this.equipo5;
    }

    public void setEquipo5(Equipo equipo5) {
        this.equipo5 = equipo5;
    }


    /**
     * @return
     */
    public int totalGoles() {
        int goles = equipo1.getGoles()+equipo2.getGoles()+equipo3.getGoles()+equipo4.getGoles()+equipo5.getGoles();
        return goles;
    }

    /**
     * @return
     */
    public int totalTirosEsquina() {
        return equipo1.getTirosEsquina() + equipo2.getTirosEsquina() + equipo3.getTirosEsquina() +
        equipo4.getTirosEsquina() + equipo5.getTirosEsquina();
    }

    /**
     * @return
     */
    public int totalAmarillas() {
        // TODO implement here
        return equipo1.getAmarillas()+equipo2.getAmarillas()+equipo3.getAmarillas()+
        equipo4.getAmarillas() + equipo5.getAmarillas();
    }

    /**
     * @return
     */
    public int totalRojas() {
        // TODO implement here
        return equipo1.getRojas()+equipo2.getRojas()+equipo3.getRojas()+equipo4.getRojas()+equipo5.getRojas();
    }

    /**
     * @param nombre
     */
    public String mostrarEstadisticasEquipo(String nombre) {
       return "";
    }

    /**
     * @param i 
     * @param nombre 
     * @param goles 
     * @param lugar 
     * @param tirosEsq 
     * @param ganados 
     * @param perdidos 
     * @param tirosAgol 
     * @param amarillas 
     * @param rojas 
     * @param faltas
     */
    public void llenarEquipo(int i, String nombre, int goles, int lugar, 
    int tirosEsq, int ganados, int perdidos, int tirosAgol, int amarillas,
    int rojas, int faltas) {
        if (i == 1){
            equipo1.setNombre(nombre);
            equipo1.setGoles(goles);
            equipo1.setLugar(lugar);
            equipo1.setTirosEsquina(tirosEsq);
            equipo1.setGanados(ganados);
            equipo1.setPerdidos(perdidos);
            equipo1.setTirosAgol(tirosAgol);
            equipo1.setAmarillas(amarillas);
            equipo1.setRojas(rojas);
            equipo1.setFaltas(faltas);
        }
        if (i == 2){
            equipo2.setNombre(nombre);
            equipo2.setGoles(goles);
            equipo2.setLugar(lugar);
            equipo2.setTirosEsquina(tirosEsq);
            equipo2.setGanados(ganados);
            equipo2.setPerdidos(perdidos);
            equipo2.setTirosAgol(tirosAgol);
            equipo2.setAmarillas(amarillas);
            equipo2.setRojas(rojas);
            equipo2.setFaltas(faltas);
        }
        if (i == 3){
            equipo3.setNombre(nombre);
            equipo3.setGoles(goles);
            equipo3.setLugar(lugar);
            equipo3.setTirosEsquina(tirosEsq);
            equipo3.setGanados(ganados);
            equipo3.setPerdidos(perdidos);
            equipo3.setTirosAgol(tirosAgol);
            equipo3.setAmarillas(amarillas);
            equipo3.setRojas(rojas);
            equipo3.setFaltas(faltas);
        }
        if (i == 4){
            equipo4.setNombre(nombre);
            equipo4.setGoles(goles);
            equipo4.setLugar(lugar);
            equipo4.setTirosEsquina(tirosEsq);
            equipo4.setGanados(ganados);
            equipo4.setPerdidos(perdidos);
            equipo4.setTirosAgol(tirosAgol);
            equipo4.setAmarillas(amarillas);
            equipo4.setRojas(rojas);
            equipo4.setFaltas(faltas);
        }
        if (i == 5){
            equipo5.setNombre(nombre);
            equipo5.setGoles(goles);
            equipo5.setLugar(lugar);
            equipo5.setTirosEsquina(tirosEsq);
            equipo5.setGanados(ganados);
            equipo5.setPerdidos(perdidos);
            equipo5.setTirosAgol(tirosAgol);
            equipo5.setAmarillas(amarillas);
            equipo5.setRojas(rojas);
            equipo5.setFaltas(faltas);
        }
    }

    /**
     * 
     */
    public String devolverEstadisticaEquipo(String nombre) {
        String cadena = "";
        if (nombre.equals(equipo1.getNombre()))
            cadena = "hola";
        return "";
    }

}