package comunicacion;

public class Fabula extends Escrito {
    private String ensenanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanzas;
    }

    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina;
    }

    public String toString() {
        return String.format("%s\n%s\n%s\n%d\n%s", 
            this.getOrigen(), 
            this.getTitulo(), 
            this.getAutor(), 
            this.getPaginas(), 
            this.getEnsenanza());
    }
}
