public interface Chain {
    public void setNextChain(Chain nextChain); // primo metodo che serve per passare da oggetto in oggetto
    public void calculate(Numbers request); // secondo che serve per effettuare l'operazione che ci serve
}
