package backEndEs04;

public class Main {

	public static void main(String[] args) {
		Dipendente dipendente1 = new Dipendente("ab65161651", 25, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente dipendente2 = new Dipendente("ab5275325", Dipartimento.PRODUZIONE);
		Dipendente dipendente3 = new Dipendente("nb7827878", 15, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dipendente4 = new Dipendente("nb8727882", 5, Livello.DIRIGENTE, Dipartimento.VENDITE);

		dipendente1.promuovi();
		dipendente3.promuovi();
		dipendente1.stampaDipendente();
		dipendente2.stampaDipendente();
		dipendente3.stampaDipendente();
		dipendente4.stampaDipendente();

		double pagaTot = Dipendente.calcolaPaga(dipendente1, 5) + Dipendente.calcolaPaga(dipendente2, 5)
				+ Dipendente.calcolaPaga(dipendente3, 5) + Dipendente.calcolaPaga(dipendente4, 5);
		System.out.println("Il totatle degli stipendi è: " + pagaTot);
	}

}
