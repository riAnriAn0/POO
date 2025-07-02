public class Utilidade {

    public static float soma(float[] vet) {
        float s = 0;
        for (int i = 0; i < vet.length; i++) {
            s += vet[i];
        }
        return s;
    }

    public static float media(float[] vet) {
        return soma(vet) / vet.length;
    }

    public static float maior(float[] vet) {
        float maior = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        return maior;
    }

    public static float menor(float[] vet) {
        float menor = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }

    public static int max(int A, int B) {
        if (A > B) {
            return A;
        } else {
            return B;
        }
    }

    public static float[] desvio(float[] vet) {
        float media = media(vet);
        float[] vetDesvios = new float[vet.length];
        for (int i = 0; i < vet.length; i++) {
            vetDesvios[i] = vet[i] - media;
        }
        return vetDesvios;

    }

    public static float desvioPadrao(float[] vet) {
        float[] desvios = desvio(vet);
        float[] qrtDesvios = new float[desvios.length];

        for (int i = 0; i < desvios.length; i++) {
            qrtDesvios[i] = desvios[i] * desvios[i];
        }

        float somaDesvios = soma(qrtDesvios);
        float mediaDesvios = somaDesvios / qrtDesvios.length;
        float desvioPadrao = (float) Math.sqrt(mediaDesvios);

        return desvioPadrao;

    }

}