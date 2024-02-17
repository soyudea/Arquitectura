package servicios.notificaciones;
public class NotificacionWhatsApp implements INotification{

    @Override
    public void notificar(Mensaje mensaje) {
        String mens = String.format("Enviando mensaje whatsApp[%s] al numero [%s] ",
        mensaje.mensaje, 
        mensaje.numeroMovil);
        System.out.println(mens);
    }

}
