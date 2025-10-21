public class Core {
    private Tag[] tagRilevati;
    private Posizione posizioneCore;
    private static int incrementoTagRilevati = 0;

    public void aggiungiAggiorna(Tag nuovoTag){
        for (int i = 0; i<incrementoTagRilevati; i++){
            if (tagRilevati[i].getCodiceUnivoco() == nuovoTag.getCodiceUnivoco()){
                aggiornaTag(nuovoTag, i);
                return;
            }
        }
        aggiungiTag(nuovoTag);
    }

    private void aggiungiTag(Tag nuovoTag){
        tagRilevati[incrementoTagRilevati] = nuovoTag;
        incrementoTagRilevati++;
    }

    private void aggiornaTag(Tag tagDaAggiornare, int indiceTag){
        tagRilevati[indiceTag] = tagDaAggiornare;
    }

    public void elimina(Tag tagDaEliminare){
        for (int i = 0; i<incrementoTagRilevati; i++){
            if (tagRilevati[i].getCodiceUnivoco() == tagDaEliminare.getCodiceUnivoco()){
                tagRilevati[i] = tagRilevati[incrementoTagRilevati-1];
                incrementoTagRilevati--;
            }
        }
    }

    public Tag[] elencaTagRilevati(){
        return tagRilevati;
    }

    public Tag[] elencaTagInferioriDistanza(float distanzaMassima){
        Tag[] elencoTag = new Tag[incrementoTagRilevati];
        for (int i = 0; i<incrementoTagRilevati; i++){
            if (tagRilevati[i].getPosizioneTag().distanzaDa(posizioneCore) < distanzaMassima){
                elencoTag[i] = tagRilevati[i];
            }
        }
        return elencoTag;
    }

    public String toString(){
        String coreString = "Core[";
        for(int i = 0; i<incrementoTagRilevati; i++){
            coreString += tagRilevati[i]; 
            if (i < incrementoTagRilevati - 1) coreString += ", ";
        }
        coreString += "]";
        return coreString;
    }

    public Posizione getPosizioneCore(){
        return posizioneCore;
    }

    public Core(int numeroTagGestibili, Posizione posizioneCore){
        tagRilevati = new Tag[numeroTagGestibili];
        this.posizioneCore = posizioneCore;
    }
}
