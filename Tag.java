public class Tag {
    private int codiceUnivoco;
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

    public Tag(int codiceUnivoco, String descrizione, Posizione posizioneTag){
        this.codiceUnivoco = codiceUnivoco;
        this.descrizione = descrizione;
        this.posizioneTag = posizioneTag;
    }

    public Tag(int codiceUnivoco, Posizione posizioneTag){
        this.codiceUnivoco = codiceUnivoco;
        this.posizioneTag = posizioneTag;
    }
}
