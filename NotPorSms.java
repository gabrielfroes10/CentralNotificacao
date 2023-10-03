public class NotPorSms implements Notificacao{
    @Override
    public void imprimir(String mensagem) {
        System.out.println("Mensagem enviada por SMS: " + mensagem);
    }
}
