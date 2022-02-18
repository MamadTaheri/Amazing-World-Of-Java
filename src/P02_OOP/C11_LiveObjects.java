package P02_OOP;

public class C11_LiveObjects {
    private static int liveInstances = 0;
    {
        liveInstances++ ;
    }
    public static int getLiveInstances(){
        return liveInstances;
    }
    protected void finalize(){
        liveInstances-- ;
    }
}
