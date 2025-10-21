public class Main {
    public static void main(String[] args){
        Core core = new Core(5, new Posizione());
        Tag primoTag = new Tag("Chiavi", new Posizione(1,1,1));
        Tag secondoTag = new Tag(new Posizione());
        Tag terzoTag = new Tag("Auto", new Posizione(1,5,2));
        Tag quartoTag = new Tag("Portafoglio", new Posizione(2,2,2));
        Tag quintoTag = new Tag("Casa", new Posizione(3,2,1));

        core.aggiungiAggiorna(primoTag);
        core.aggiungiAggiorna(secondoTag);
        core.aggiungiAggiorna(terzoTag);
        core.aggiungiAggiorna(quartoTag);
        core.aggiungiAggiorna(quintoTag);
        System.out.println(core);

        core.elimina(terzoTag);
        System.out.println(core);

        System.out.println(terzoTag.distanzaDaCore(core));
        secondoTag.setDescrizione("Telefono");
        System.out.println(core);
    }
}
