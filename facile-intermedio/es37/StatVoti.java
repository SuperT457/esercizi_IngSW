import java.util.Arrays;
import java.util.HashMap;

public class StatVoti {
    public static double media(int[] voti) {
        int somma = 0;
        for (int v : voti) somma += v;
        return voti.length > 0 ? (double) somma / voti.length : 0;
    }

    public static int moda(int[] voti) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int v : voti) freq.put(v, freq.getOrDefault(v, 0) + 1);
        int moda = voti[0], max = 0;
        for (int v : freq.keySet()) {
            if (freq.get(v) > max) {
                max = freq.get(v);
                moda = v;
            }
        }
        return moda;
    }

    public static double mediana(int[] voti) {
        int[] copy = Arrays.copyOf(voti, voti.length);
        Arrays.sort(copy);
        int n = copy.length;
        if (n == 0) return 0;
        if (n % 2 == 1) return copy[n/2];
        return (copy[n/2 - 1] + copy[n/2]) / 2.0;
    }
}
