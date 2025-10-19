public class Main {
    public static void main(String[] args){
        Core core = new Core(5, new Posizione());
        Tag primoTag = new Tag(674745, "Chiavi", new Posizione(1,1,1));
        Tag secondoTag = new Tag(687678, new Posizione());
        Tag terzoTag = new Tag(5675675, "Auto", new Posizione(1,5,2));
        Tag quartoTag = new Tag(687678, "Portafoglio", new Posizione(2,2,2));

        core.aggiungiAggiorna(primoTag);
        core.aggiungiAggiorna(secondoTag);
        core.aggiungiAggiorna(terzoTag);
        System.out.println("Elenco tag aggiunti al core");
        String[] elencoTagRilevati = core.elencaTagRilevati();
        for (int i = 0; i<elencoTagRilevati.length; i++){
            System.out.println(elencoTagRilevati[i]);
        }

        core.aggiungiAggiorna(quartoTag);
        System.out.println();
        System.out.println("Aggiornato il tag " + quartoTag.getCodiceUnivoco());
        elencoTagRilevati = core.elencaTagRilevati();
        for (int i = 0; i<elencoTagRilevati.length; i++){
            System.out.println(elencoTagRilevati[i]);
        }

        core.elimina(secondoTag);
        System.out.println();
        System.out.println("Eliminato il tag " + secondoTag.getCodiceUnivoco());
        elencoTagRilevati = core.elencaTagRilevati();
        for (int i = 0; i<elencoTagRilevati.length; i++){
            System.out.println(elencoTagRilevati[i]);
        }

        System.out.println();
        System.out.println("Distanza tag " + primoTag.getCodiceUnivoco() + " da core: " + primoTag.distanzaDaCore(core));
        System.out.println("Distanza tag " + terzoTag.getCodiceUnivoco() + " da core: " + terzoTag.distanzaDaCore(core));
        float[] posizioneDaCore = primoTag.posizioneDaCore(core);
        System.out.println("Posizione tag " + primoTag.getCodiceUnivoco() + " da core: " + "x: " + posizioneDaCore[0] + " y: " + posizioneDaCore[1] + " z: " + posizioneDaCore[2]);

        System.out.println();
        float distanzaMassima = 2;
        System.out.println("Elenco tag a distanza inferiore di " + distanzaMassima);
        String[] elencoTagInferioriDistanza = core.elencaTagInferioriDistanza(distanzaMassima);
        for (int i = 0; i<elencoTagInferioriDistanza.length; i++){
            System.out.println(elencoTagInferioriDistanza[i]);
        }
    }
}
