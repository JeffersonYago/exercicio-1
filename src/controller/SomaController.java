package controller;
public class SomaController {
	public SomaController() {
		super();
	}
	public int soma(int n){
	    if(n == 0)
	        return 0;
	    else
	        return n + soma(n - 1);
	}
}
