public class Actividad5 {

	public static void main(String[] args) {

		int[][] matriz = new int[6][10];
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				int numero = (int) (Math.random()*1000+0);
				boolean repetido = true;
				do {
					for (int filasMatriz = 0; filasMatriz < matriz.length; filasMatriz++) {
						for (int columnasMatriz = 0; columnasMatriz < matriz[filasMatriz].length; columnasMatriz++) {
							if (numero == matriz[filasMatriz][columnasMatriz]) {
								System.out.println("True");
								repetido = true;
								break;
							} else {
								System.out.println("False");
								repetido = false;
							}
						}
					}
				} while (repetido == true);
				matriz[fila][columna] = numero;
			}
		}
		
		for (int filasMostrar = 0; filasMostrar < matriz.length; filasMostrar++) {
			for (int columnasMostrar = 0; columnasMostrar < matriz[filasMostrar].length; columnasMostrar++) {
				System.out.printf("%5d", matriz[filasMostrar][columnasMostrar]);
			}
			System.out.println("");
		}

	}

}
