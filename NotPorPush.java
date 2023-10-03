public class NotPorPush implements Notificacao{

    @Override
    public void imprimir(String mensagem) {
        System.out.println("Mensagem enviada por push: " + mensagem);
    }
}
