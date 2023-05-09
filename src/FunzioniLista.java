import java.util.*;

public class FunzioniLista {
	public static void main(String[] args) {
        List<Integer> listaCasuale = listaCasuale(10);
        System.out.println("Lista casuale ordinata: " + listaCasuale);
        List<Integer> listaInversa = listaInversa(listaCasuale);
        System.out.println("Lista inversa: " + listaInversa);
        stampaPosizione(listaCasuale, true);
        stampaPosizione(listaInversa, false);
    }
	
    public static List<Integer> listaCasuale(int n) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(rand.nextInt(101)); // Numeri casuali tra 0 e 100 inclusi
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> listaInversa(List<Integer> lista) {
        List<Integer> listaInversa = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInversa.add(lista.get(i));
        }
        return listaInversa;
    }

    public static void stampaPosizione(List<Integer> lista, boolean pari) {
        System.out.println("Valori in posizione " + (pari ? "pari:" : "dispari:"));
        for (int i = (pari ? 0 : 1); i < lista.size(); i += 2) {
            System.out.println(lista.get(i));
        }
    }
}
