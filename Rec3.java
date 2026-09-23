import javax.swing.JOptionPane;

public class rec3 {
    public static void main (String args[]){
        Double n;
        Double res;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        res = Recursiva(n);
        System.out.println("Resultado: " + res);
    }
        public static Double Recursiva(Double numero){
            if (numero == 1){
                return numero;
            }
            return 1/numero + Recursiva(numero - 1);
        }
}
