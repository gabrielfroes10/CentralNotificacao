public class NotPorEmail implements Notificacao{

    @Override
    public void imprimir(String mensagem) {
        System.out.println("Mensagem enviada por email: " + mensagem);
    }
}
