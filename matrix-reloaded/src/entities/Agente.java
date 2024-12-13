package entities;

public class Agente extends Entidad {

    private String habilidadEspecial;
    private String misionAsignada;
    //Requerimiento 8: Entrenamiento Simple Descripción: Mejorar las habilidades de un agente mediante un entrenamiento. Tareas: Añadir un método entrenar(String habilidad, int incremento) en la clase Agent. Incrementar el valor de la habilidad específica en el agente. Mostrar las habilidades del agente después del entrenamiento.

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial
                + (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
