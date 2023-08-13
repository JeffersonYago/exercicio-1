package controller;
public class SomaController {
	public SomaController() {
		super();
	}
	public int soma(int n){
	    if(n == 0)
// quando n for igual a 0, a função deixará de ser chamada para ser realizada a soma dos números anteriores
	        return 0;
	    else
	        return n + soma(n - 1);
// toda a vez que a função é chamada, um número é adicionado á pilha para ser somado ao anterior
	}
}
