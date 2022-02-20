package questao03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Questao03 {

	/*
		O método abaixo, ordena as letras alfabeticamente de uma string. Primeiro a string é convertida em
		um vetor de char[], depois esse vetor é ordenado pelo metodo Arrays.sort(), e em seguida a string é
		montada novamente por meio de uma interação em um for.
	 */
	private String ordenarString(String str) {
		char[] letras = str.toCharArray();
		Arrays.sort(letras);
		StringBuilder stringOrdenada = new StringBuilder();
		for (char letra : letras) {
			stringOrdenada.append(letra);
		}
		return stringOrdenada.toString();
	}

	/*
		O metodo separarSubstringsEAdicionarNoMap(), pega todas as substrings possiveis da string de entrada no metodo.
		 Essas substrings antes de serem adicionadas no Map, são ordenadas alfabeticamente. Em seguida,
		 se é vericado se o Map já contém uma chave de substring igual a que vai ser adicionada, se houver igual,
		 o valor pertencente aquela chave que representa o numero de repetições daquela substring é incrementado.
		 Se não houver chave igual aquela substring, se é adicionado o valor 1, que representa a única vez que aquela
		 substring apareceu.
	 */
	public HashMap<String, Integer> separarSubstringsEAdicionarNoMap(String palavra){
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i< palavra.length(); i++) {
			for(int j = i+ 1; j<= palavra.length(); j++) {
				String subString = palavra.substring(i, j);
				String stringOrdenada = ordenarString(subString);
				if(map.containsKey(stringOrdenada)) {
					int cont = map.get(stringOrdenada);
					map.put(stringOrdenada, cont + 1);
				}else {
					map.put(stringOrdenada, 1);
				}
			}
		}
		return map;
	}
	/*
		O método abaixo pega o Map contendo as chaves representadas pelas substrings, e os valores que representam
		o número de repetições para cada substring.
		Após isso, pegamos todos os valores contidos neste Map, e então	fazemos um cálculo para descobrir
		quantas combinações/anagramas foi encontrado, ou seja o	número de substring repetidas
		encontrados que resultam na quantidade de anagramas gerados.
		A fórmula para tal calculo é: n(n-1)/2, onde n representa o número de repetições de substrings, se o
		valor de n for igual ou maior que 2, há um ou mais de um anagrama, para aquela substring.
	 */
	public int contadorDeAnagramas(String palavra){
		int contador = 0;
		HashMap<String, Integer> mapDeSubstrings = separarSubstringsEAdicionarNoMap(palavra);

		for(Map.Entry <String, Integer> entries : mapDeSubstrings.entrySet()) {
			contador += (entries.getValue() * (entries.getValue() - 1)) /2;
		}
		return contador;
	}
}
