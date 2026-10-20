
public class Usuario {

    private final Notificador notificador;

    public Usuario(Notificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(String nome) {

        System.out.println("Usuário " + nome + " registrado.");

        notificador.enviarMensagem("Bem-vindo(a) " + nome + "!");
    }
}