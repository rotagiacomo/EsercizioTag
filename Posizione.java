public class Posizione {
    private float x;
    private float y;
    private float z;

    public double distanzaDa(Posizione origine){
        return Math.sqrt((x - origine.x)*(x - origine.x) + (y - origine.y)*(y - origine.y) + (z - origine.z)*(z - origine.z));
    }

    public Posizione posizioneDa(Posizione origine){
        Posizione posizioneDaOrigine = new Posizione(x- origine.x, y-origine.y, z-origine.z);
        return posizioneDaOrigine;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Posizione(){
        x = 0;
        y = 0;
        z = 0;
    }

    public Posizione(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
