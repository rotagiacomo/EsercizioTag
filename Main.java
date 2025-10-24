public class Main {
    public static void main(String[] args){
        Core core = new Core(10, new Posizione());
        Tag primoTag = new Tag("Chiavi", new Posizione(1,1,1));
        Tag secondoTag = new Tag(new Posizione());
        Tag terzoTag = new Tag("Auto", new Posizione(1,5,2));
        Tag quartoTag = new Tag("Portafoglio", new Posizione(2,2,2));
        Tag quintoTag = new Tag("Orologio", new Posizione(1,1,2));

        System.out.println("Aggiungo 2 tag con il metodo aggiungiAggiorna");
        core.aggiungiAggiorna(primoTag);
        core.aggiungiAggiorna(secondoTag);
        System.out.println(core);

        System.out.println();
        System.out.println("Aggiungo un array di 2 Tag");
        Tag[] arrayTags = new Tag[5];
        arrayTags[0] = terzoTag;
        arrayTags[1] = quartoTag;
        core.aggiungiAggiorna(arrayTags);
        System.out.println(core);

        System.out.println();
        System.out.println("Rimuovo il tag");
        core.elimina(terzoTag);
        System.out.println(core);

        System.out.println();
        System.out.println("Aggiungo un array di 2 Tag di cui uno deve essere aggiornato");
        arrayTags[0] = quintoTag;
        arrayTags[1] = quartoTag;
        core.aggiungiAggiorna(arrayTags);
        System.out.println(core);

        System.out.println();
        System.out.println("Verifico il metodo dei tag inferiori a distanza");
        System.out.println(Tag.arrayToString(core.elencaTagInferioriDistanza(2)));

        core.elimina(terzoTag);
    }
}
