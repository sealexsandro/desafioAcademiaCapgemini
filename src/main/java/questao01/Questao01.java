package questao01;

public class Questao01 {

	/*
		O método desenharEscada() abaixo percorre a altura da escada e a cada iteração chama o metodo
		desenharDegrau(), já este metodo irá desenhar um degrau por vez de cima para baixo.
	 */
	public String desenharEscada(int alturaDaEscada) {
		StringBuilder escada = new StringBuilder();

		if (alturaDaEscada > 0) {
			for (int degrau = 1; degrau <= alturaDaEscada; degrau++) {
				escada.append(desenharDegrau(alturaDaEscada, degrau));
			}
		}
		return escada.toString();
	}

	/*
		O método desenharDegrau() abaixo desenha um degrau por vez, de cima para baixo,
		a quantidade de espaços em branco na frente de cada asterisco é definida pela altura e o numero do grau.
		Ao fim, se ainda tiver mais degraus para desenhar, a linha é quebrada com \n para quando o proximo degrau
		for desenhado.
	 */
	private String desenharDegrau(int alturaDaEscada, int numeroDoDegrau) {

		StringBuilder degrau = new StringBuilder();
		int qntDeEspacos = alturaDaEscada - numeroDoDegrau;
		for (int i = 0; i < alturaDaEscada; i++) {
			if (qntDeEspacos > 0) {
				degrau.append(" ");
				qntDeEspacos--;
			} else {
				degrau.append("*");
			}
		}
		if (numeroDoDegrau < alturaDaEscada) {
			degrau.append("\n");
		}
		return degrau.toString();
	}
}
