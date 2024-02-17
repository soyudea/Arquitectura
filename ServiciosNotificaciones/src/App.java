import servicios.notificaciones.Canal;
import servicios.notificaciones.INotification;
import servicios.notificaciones.Mensaje;
import servicios.notificaciones.NotificacionCorreo;
import servicios.notificaciones.NotificacionFactory;

public class App {
    public static void main(String[] args) throws Exception {
        NotificacionFactory notificacionfactory = new NotificacionFactory();
        //INotification notificacion = notificacionfactory.crearNotificacINotification(Canal.CORREO);
        //INotification notificacion = notificacionfactory.crearNotificacINotification(Canal.SMS);
        INotification notificacion = notificacionfactory.crearNotificacINotification(Canal.WHATSAPP);
        Mensaje mensaje = new  Mensaje("3043440112","Hola como estas");
        notificacion.notificar(mensaje);
    }
}
