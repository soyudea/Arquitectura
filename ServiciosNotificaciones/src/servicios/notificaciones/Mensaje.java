package servicios.notificaciones;

public class Mensaje {
    String numeroMovil;
    String buzon;
    String asunto;
    String mensaje;
    Usuario usuario;

    public Mensaje(String numeroMovil, String mensaje) {
        this.numeroMovil = numeroMovil;
        this.mensaje = mensaje;
    }

    public Mensaje(String buzon, String asunto, String mensaje) {
        this.buzon = buzon;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public Mensaje(String mensaje, Usuario usuario) {
        this.mensaje = mensaje;
        this.usuario = usuario;
    }
    
  

    
}
