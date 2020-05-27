package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class NewRoadSystem {

    //each city has the same number of incoming and outgoing roads?
    boolean newRoadSystem(boolean[][] roadRegister) {
        City[] cities  = new City[roadRegister.length];
        for (int i=0;i<roadRegister.length;i++){
            for (int j=0;j<roadRegister[i].length;j++){
                if (roadRegister[i][j]){
                    if (cities[i]==null){
                        City c = new City();
                        c.roadsFromCity=1;
                        cities[i]=c;
                    }else{
                        cities[i].roadsFromCity=cities[i].roadsFromCity+1;
                    }
                    if (cities[j]==null){
                        City c = new City();
                        c.roadsToCity=1;
                        cities[j]=c;
                    }else{
                        cities[j].roadsToCity=cities[j].roadsToCity+1;
                    }
                }
            }
        }
        for (City city : cities){
            if (city!=null){
                if (city.roadsToCity!=city.roadsFromCity) return false;
            }
        }
        return true;
    }

    class City{
        int roadsFromCity=0;
        int roadsToCity=0;
    }

    public static void main(String[] args) {

    }
}
