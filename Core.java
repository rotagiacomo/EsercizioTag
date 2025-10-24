public class Core {
    private Tag[] tagRilevati;
    private Posizione posizioneCore;
    private static int dimensioneArrayTag = 0;

    public void aggiungiAggiorna(Tag nuovoTag){
        int indiceTag = trovaIndiceTag(nuovoTag);
        if (indiceTag == -1) 
            aggiungiTag(nuovoTag);
        else    
            aggiornaTag(nuovoTag, indiceTag);
    }

    public void aggiungiAggiorna(Tag[] nuoviTag){
        for (int i = 0; i<dimensioneArrayTag; i++){
            for (int j = 0; j<nuoviTag.length && nuoviTag[j] != null; j++){
                if (tagRilevati[i].getCodiceUnivoco() == nuoviTag[j].getCodiceUnivoco()){
                    aggiornaTag(nuoviTag[j], i);
                    nuoviTag[j] = null;
                }
            }
        }
        for (int i = 0; i<nuoviTag.length; i++){
            if (nuoviTag[i] != null){
                aggiungiTag(nuoviTag[i]);
            }
        }
    }

    private void aggiungiTag(Tag nuovoTag){
        tagRilevati[dimensioneArrayTag] = nuovoTag;
        dimensioneArrayTag++;
    }

    private void aggiornaTag(Tag tagDaAggiornare, int indiceTag){
        tagRilevati[indiceTag] = tagDaAggiornare;
    }

    private int trovaIndiceTag(Tag tagDaTrovare){
        for(int i = 0; i<dimensioneArrayTag && tagRilevati[i].getCodiceUnivoco() <= tagDaTrovare.getCodiceUnivoco(); i++){
            if(tagRilevati[i].getCodiceUnivoco() == tagDaTrovare.getCodiceUnivoco()){
                return i;
            }
        }
        return -1;
    }

    public void elimina(Tag tagDaEliminare){
        int indiceTag = trovaIndiceTag(tagDaEliminare);
        if (indiceTag != -1){
            for(int i = indiceTag; i<dimensioneArrayTag; i++){
                tagRilevati[i] = tagRilevati[i+1];
            }
            dimensioneArrayTag--;
        }
    }

    public Tag[] elencaTagRilevati(){
        return tagRilevati;
    }

    public Tag[] elencaTagInferioriDistanza(float distanzaMassima){
        Tag[] elencoTag = new Tag[dimensioneArrayTag];
        for (int i = 0; i<dimensioneArrayTag; i++){
            if (tagRilevati[i].getPosizioneTag().distanzaDa(posizioneCore) < distanzaMassima){
                elencoTag[i] = tagRilevati[i];
            }
        }
        return elencoTag;
    }

    public String toString(){
        String coreString = "Core[";
        for(int i = 0; i<dimensioneArrayTag; i++){
            coreString += tagRilevati[i]; 
            if (i < dimensioneArrayTag - 1) coreString += ", ";
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
