public class Rec1 {
    public static int recursiva(int num){
        if (num == 1){
            return num;
        }
        return num + recursiva(num - 1);
    }
    
    public static void main(String args[]){
        int numero = 100;
        int res;
        res = recursiva(numero);
        System.out.println("Resultado: " + res);
    }
}
