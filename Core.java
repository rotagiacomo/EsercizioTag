public class Core {
    private Tag[] tagRilevati;
    private Posizione posizioneCore;

    public void aggiungiAggiorna(Tag nuovoTag){
        int i = 0;
        for (; i<tagRilevati.length && tagRilevati[i] != null; i++){
            if (tagRilevati[i].getCodiceUnivoco() == nuovoTag.getCodiceUnivoco()){
                tagRilevati[i] = nuovoTag;
                return;
            }
        }
        tagRilevati[i] = nuovoTag;
    }

    public void elimina(Tag tagDaEliminare){
        for (int i = 0; i<tagRilevati.length && tagRilevati[i] != null; i++){
            if (tagRilevati[i].getCodiceUnivoco() == tagDaEliminare.getCodiceUnivoco()){
                for (int j = i; j<tagRilevati.length && tagRilevati[j] != null; j++){
                    tagRilevati[j] = tagRilevati[j+1];
                }
            }
        }
    }

    public String[] elencaTagRilevati(){
        String[] elencoTag = new String[tagRilevati.length];
        for (int i = 0; i<tagRilevati.length && tagRilevati[i] != null; i++){
            elencoTag[i] = tagRilevati[i].getCodiceUnivoco() + ": " + tagRilevati[i].getDescrizione();
        }
        return elencoTag;
    }

    public String[] elencaTagInferioriDistanza(float distanzaMassima){
        String[] elencoTag = new String[tagRilevati.length];
        for (int i = 0; i<tagRilevati.length && tagRilevati[i] != null; i++){
            if (tagRilevati[i].getPosizioneTag().distanzaDa(posizioneCore) < distanzaMassima){
                elencoTag[i] = tagRilevati[i].getCodiceUnivoco() + ": " + tagRilevati[i].getDescrizione();
            }
        }
        return elencoTag;
    }

    public Posizione getPosizioneCore(){
        return posizioneCore;
    }

    public Core(int numeroTagGestibili, Posizione posizioneCore){
        tagRilevati = new Tag[numeroTagGestibili];
        this.posizioneCore = posizioneCore;
    }
}
