package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        // Inicializa o conjunto 'a' com números inteiros usando TreeSet.
        // TreeSet mantém os elementos em ordem crescente.
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));

        // Inicializa o conjunto 'b' com outro conjunto de números inteiros.
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // União: Combina todos os elementos de 'a' e 'b'.
        // Cria um novo conjunto 'c' e inicializa com os elementos de 'a'.
        Set<Integer> c = new TreeSet<>(a);
        // Adiciona todos os elementos de 'b' ao conjunto 'c'.
        c.addAll(b);
        // Imprime o conjunto resultante da união.
        System.out.println(c); // Saída: [0, 2, 4, 5, 6, 7, 8, 9, 10]

        // Interseção: Mantém apenas os elementos que estão presentes em ambos os conjuntos.
        // Cria um novo conjunto 'd' e inicializa com os elementos de 'a'.
        Set<Integer> d = new TreeSet<>(a);
        // Retém apenas os elementos que também estão em 'b'.
        d.retainAll(b);
        // Imprime o conjunto resultante da interseção.
        System.out.println(d); // Saída: [5, 6, 8, 10]

        // Diferença: Mantém os elementos que estão em 'a' mas não em 'b'.
        // Cria um novo conjunto 'e' e inicializa com os elementos de 'a'.
        Set<Integer> e = new TreeSet<>(a);
        // Remove todos os elementos que estão também em 'b'.
        e.removeAll(b);
        // Imprime o conjunto resultante da diferença.
        System.out.println(e); // Saída: [0, 2, 4]
    }
}