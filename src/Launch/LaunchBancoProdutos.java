package Launch;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import exercicios.Produto;

import java.util.Set;
import java.util.TreeMap;

public class LaunchBancoProdutos {

	private static HashMap<Long, Produto> mapaHash;
	private static TreeMap<Long, Produto> mapaTree;

	public static void main(String[] args) {

		mapaHash = new HashMap<Long, Produto>();
		povoarHash(mapaHash);
		System.out.println("\n------------------------\n");
		mapaTree = new TreeMap<Long, Produto>();
		povoarHash(mapaTree);

	}

	private static void povoarHash(Map<Long, Produto> mapa) {

		Produto p1 = new Produto(1, "Xbox Series s", 3400.0);
		Produto p2 = new Produto(2, "Xbox Series X", 4500.0);
		Produto p3 = new Produto(3, "Xbox One s", 2200.0);
		Produto p4 = new Produto(4, "Xbox One X", 3000.0);
		Produto p5 = new Produto(5, "PS4 pro", 2700.0);
		Produto p6 = new Produto(6, "PS4 pro", 4500.0);
		Produto p7 = new Produto(7, "Xbox Series s", 2700.0);
		Produto p8 = new Produto(8, "Xbox Series X", 4500.0);

		mapa.put(p1.getCodigo(), p1);
		mapa.put(p2.getCodigo(), p2);
		mapa.put(p3.getCodigo(), p3);
		mapa.put(p4.getCodigo(), p4);
		mapa.put(p5.getCodigo(), p5);
		mapa.put(p6.getCodigo(), p6);
		mapa.put(p7.getCodigo(), p7);

		Set<Entry<Long, Produto>> entries = mapa.entrySet();
		for (Entry<Long, Produto> entry : entries) {
			System.out.println("A chave: " + entry.getKey() + 
					           " , Nome: " + entry.getValue().getNome());
		}

	}

}
