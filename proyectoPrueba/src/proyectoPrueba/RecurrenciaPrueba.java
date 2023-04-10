package proyectoPrueba;

public class RecurrenciaPrueba {
	public static int numeroMenor(int[] v, int numMenor, int i) {
		if (i == v.length)
			return numMenor;
		
		if (v[i] < numMenor)
			numMenor = v[i];
		return numeroMenor(v, numMenor, i+1);
	}

	public static void main(String[] args) {
		int[] v = {5, 4, 3, 9};
		System.out.println(numeroMenor(v, v[0], 1));
	}

}
