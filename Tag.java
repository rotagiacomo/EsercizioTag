public class Tag {
    private int codiceUnivoco;
    private static int incrementoCodice = 0;
    private String descrizione;
    private Posizione posizioneTag;

    public double distanzaDaCore(Core rilevatore){
        return posizioneTag.distanzaDa(rilevatore.getPosizioneCore());
    }

    public float[] posizioneDaCore(Core core){
        Posizione posizioneOttenuta = posizioneTag.posizioneDa(core.getPosizioneCore());
        float[] xyz = new float[3];
        xyz[0] = posizioneOttenuta.getX();
        xyz[1] = posizioneOttenuta.getY();
        xyz[2] = posizioneOttenuta.getZ();
        return xyz;
    }

    public String toString(){
        return "Tag[ codiceUnivoco: " + codiceUnivoco + ", descrizione: " + descrizione + "]"; 
    }

    public static String arrayToString(Tag[] arrayTag){ //metodo di utilità
        String arrayTagString = "[";
        for (int i = 0; i<arrayTag.length && arrayTag[i] != null; i++){
            arrayTagString += arrayTag[i];
            if(i < arrayTag.length -1 && arrayTag[i+1] != null){
                arrayTagString += ", ";
            }
        }
        arrayTagString += "]";
        return arrayTagString;
    }

    public int getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Posizione getPosizioneTag() {
        return posizioneTag;
    }

    public void setDescrizione(String nuovaDescrizione){
        descrizione = nuovaDescrizione;
    }

    public void setPosizioneTag(Posizione nuovaPosizione){
        posizioneTag = nuovaPosizione;
    }

    public Tag(String descrizione, Posizione posizioneTag){
        this.codiceUnivoco = incrementoCodice++;
        this.descrizione = descrizione;
        this.posizioneTag = posizioneTag;
    }

    public Tag(Posizione posizioneTag){
        this.codiceUnivoco = incrementoCodice++;
        this.posizioneTag = posizioneTag;
    }
}
