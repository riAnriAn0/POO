public class Teste {
    public static void main(String[] args) {
        
        float[] numeros = { 10.5f, 20.0f, 30.5f, 40.0f };

        System.out.print("Array: ");
        for (float numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.println("Media: " + Utilidade.media(numeros));
        System.out.println("Soma: " + Utilidade.soma(numeros));
        System.out.println("Maior: " + Utilidade.maior(numeros));
        System.out.println("Menor: " + Utilidade.menor(numeros));
        System.out.println("Maior entre 7 e 12: " + Utilidade.max(7, 12));
        System.out.println("Desvio Padeao: "+ Utilidade.desvioPadrao(numeros));
    }
}