package questao02;

public class Questao02 {

	/*
		Calcula o número de caracteres a serem adicionados. Se a senha atender o requisito minimo de
		6 caracteres, então é retornado zero.
	 */
	public int numeroDeCaracteresASerAdicionadoEmSenha(String senha){
		if (senha.length() < 6) {
			return 6 - senha.length();
		}
		return 0;
	}

	/*
		A regex abaixo verifica se há no minimo 1 digito, a senha também tem que ter no minimo 6 caracteres.
	 */
	public boolean senhaTemNoMininoUmNumero(String senha){
		if (senha.matches("(?=.*[0-9]).{6,}")) {
			return true;
		}
		return false;
	}

	/*
		A regex abaixo verifica se há no minimo 1 letra minuscula.
	 */
	public boolean senhaTemNoMinimoUmaLetraMinuscula(String senha){
		if (senha.matches("(?=.*[a-z]).{6,}")) {
			return true;
		}
		return false;
	}

	/*
		A regex abaixo verifica se há no minimo 1 letra maiuscula.
	 */
	public boolean senhaTemNoMinimoUmaLetraMaiuscula(String senha){
		if (senha.matches("(?=.*[A-Z]).{6,}")) {
			return true;
		}
		return false;
	}

	/*
		A regex abaixo verifica se há no minimo 1 caractere especial
	 */
	public boolean senhaTemNoMinimoUmCaractereEspecial(String senha){
		if (senha.matches("(?=.*[!@#$%^&*()\\-+]).{6,}")) {
			return true;
		}
		return false;
	}
}
