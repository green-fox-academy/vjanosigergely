package aircraftcarrier;

public class Aircraft {

    int currentAmmo = 0;
    int maxAmmo;
    int baseDamage;
    boolean isPriority = this.getClass().getSimpleName().equals("F35");

    Aircraft(){

    }

    //fight//It should use all the ammo (set it to 0) and it should return the damage it deals
    //The damage dealt is calculated by multiplying the base damage by the ammunition

    public int fight (){
        int damage = this.baseDamage * this.currentAmmo;
        currentAmmo = 0;
        return damage;
    }

    //refill
    //It should take a number as parameter and subtract as much ammo as possible
    //It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
    //It should return the remaining ammo
    //Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
    public int refill(int parameter){
        int filling = Math.min(parameter, maxAmmo-currentAmmo);
        currentAmmo = filling;
        return parameter - filling;
    }

    //gettype It should return the type of the aircraft as a string
    public String gettype (){
        String type = this.getClass().getSimpleName();

        return type;
    }

    //getStatus
    //It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    public String getStatus(){
        String status = "";
        status = "Type " + this.getClass().getSimpleName() + ", Ammo: " + currentAmmo + ", Base Damage: "
                + baseDamage + ", All Damage: " + baseDamage*currentAmmo;
        return status;
    }

    //isPriority
    //It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
    public boolean isPriority (){
        boolean urgent = this.getClass().getSimpleName().equals("F35");

        return urgent;
    }


}
