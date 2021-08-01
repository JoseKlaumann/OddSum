package test;

public class Odds {

	private int N;
	private int X;
	private int Y;
	private int sum;
	private int aux;
	private int cont;
	
	public Odds() {
	}
	
	public Odds(int N, int X, int Y, int sum, int aux, int cont) {
		this.N = N;
		this.X = X;
		this.Y = Y;
		this.sum = sum;
		this.aux = aux;
		this.cont = cont;
	}
	
	public int getN() {
		return N;
	}
	
	public void setN(int N) {
		this.N = N;
	}
	
	public int getX() {
		return X;
	}
	
	public void setX(int X) {
		this.X = X;
	}
	
	public int getY() {
		return Y;
	}
	
	public void setY(int Y) {
		this.Y = Y;
	}
	
	public int getAux() { //pega o atributo 'aux' valendo 0
		return aux;
	}
	
	public void addAux() { //adiciona 1 ao atributo 'aux'
		this.aux = aux + 1;
	}
	
	public void setAux() { //reseta o atribito 'aux'
		this.aux -= aux;
	}
	
	public int getCont() { //pega o atributo 'cont' valendo 0
		return cont;
	}
	
	public void addCont() { //adiciona 1 ao atributo 'cont'
		this.cont = cont + 1;
	}
	
	public void setCont(int cont) { //pega o atributo 'cont' para poder atribuir um valor a ele
		this.cont = cont;
	}
	
	public void resetCont() { //reseta o atributo 'cont'
		this.cont -= cont;
	}
	
	public void addSum (int sum) { //adiciona um valor ao atributo 'sum'
		this.sum += sum;
	}
	
	public void setSum() { //reseta o atributo 'sum'
		this.sum -= sum;
	}
	
	public String toString() { //imprime a soma dos impares
		return "result is: " + sum;
 	}
}
