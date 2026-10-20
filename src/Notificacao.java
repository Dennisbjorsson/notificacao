public class Notificacao {

    public static void main(String[] args) {

        Usuario usuarioEmail =
                new Usuario(new Email());

        usuarioEmail.registrar("Dennis");

        System.out.println();

        Usuario usuarioSms =
                new Usuario(new Sms());

        usuarioSms.registrar("Ana");

        System.out.println();

        Usuario usuarioWhatsapp =
                new Usuario (new Whatsapp());

        usuarioWhatsapp.registrar("Gunnar");
    }
}
