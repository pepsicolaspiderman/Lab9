public class Auto {
    private String firm;
    private int maxSpeed;
    private String gosnomer;
    public void setFirm(String firma){
        firm=firma;
    }
    public void setMaxSpeed(int speed){
        maxSpeed = speed;
    }
    public void setGosnomer(String nomer) {gosnomer = nomer;}
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm(){ return firm; }
    public String getGosnomer(){ return gosnomer;}
    public Auto(){
        firm = "Без названия";
        maxSpeed = 0;
        gosnomer = "а111аа";
    }
    public Auto(String firma, int speed, String nomer){
        firm = firma;
        maxSpeed = speed;
        gosnomer = nomer;
    }
}
