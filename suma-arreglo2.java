import javax.swing.JOptionPane;

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9}, numerosComplementarios = {0, 0, 0, 0, 0, 0, 0, 0, 0}, numerosFinales = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0;i < numeros.length; i++) {
            numerosComplementarios[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que le faltaria a "+numeros[i]+" para dar 10"));
        }
        for (int i = 0;i < numeros.length; i++) {
            numerosFinales[i] = numeros[i] + numerosComplementarios[i];
            if (numerosFinales[i] != 10) {
                System.out.println(numeros[i]+" + "+numerosComplementarios[i]+ " da "+numerosFinales[i]+" no 10");
            }
        }
    }
