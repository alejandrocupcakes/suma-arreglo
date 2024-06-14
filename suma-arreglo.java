import javax.swing.JOptionPane;

  public static void main(String[] args) {
        double[] promediosMateria1 = {0.4, 5, 2, 4, 3.5}, promediosMateria2 = {2, 3.2, 4, 0, 0}, promedioTotal = {0, 0, 0, 0, 0};
        for (int i = 0; i < promediosMateria1.length;i++) {
            promedioTotal[i] += promediosMateria1[i];
            promedioTotal[i] += promediosMateria1[i];
        }
        System.out.print("Suma de todos los promedios de los estudiantes: ");
        for (int i = 0; i < promedioTotal.length;i++) {
            System.out.print(promedioTotal[i]);
        }
  }
