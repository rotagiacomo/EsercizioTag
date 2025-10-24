public class Main {
    public static void main(String[] args){
        Core core = new Core(10, new Posizione());
        Tag primoTag = new Tag("Chiavi", new Posizione(1,1,1));
        Tag secondoTag = new Tag(new Posizione());
        Tag terzoTag = new Tag("Auto", new Posizione(1,5,2));
        Tag quartoTag = new Tag("Portafoglio", new Posizione(2,2,2));
        Tag quintoTag = new Tag("Casa", new Posizione(3,2,1));
        Tag[] arrayTags = new Tag[5];
        arrayTags[0] = terzoTag;
        arrayTags[1] = quartoTag;

        core.aggiungiAggiorna(primoTag);
        core.aggiungiAggiorna(secondoTag);
        System.out.println(core);

        core.aggiungiAggiorna(arrayTags);
        System.out.println(core);

        arrayTags[1] = quintoTag;
        core.aggiungiAggiorna(arrayTags);
        System.out.println(core);

        core.elimina(terzoTag);
        System.out.println(core);

        core.aggiungiAggiorna(arrayTags);
        System.out.println(core);
    }
}
