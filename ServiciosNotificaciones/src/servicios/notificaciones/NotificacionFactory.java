package servicios.notificaciones;

public class NotificacionFactory {
    public INotification crearNotificacINotification(Canal canal){
        switch(canal){
            case SMS:return new NotificacionSMS();
            case CORREO : return new NotificacionCorreo();
            case INSERCION: return new NotificacionInsercion();
            case WHATSAPP: return new NotificacionWhatsApp();
        }
        return null;
    }
}
