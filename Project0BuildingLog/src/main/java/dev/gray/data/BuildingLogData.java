package dev.gray.data;

import dev.gray.building_log.BuildingLog;

import java.util.ArrayList;
import java.util.List;

public class BuildingLogData {

    private List<BuildingLog> log = new ArrayList<>();


    public BuildingLogData(){
        super();

        log.add(new BuildingLog(4321, 1234, "Hersey's", true, "02022021", 0600));
        log.add(new BuildingLog(4322, 1235, "Ross", true, "03012021", 0700));
        log.add(new BuildingLog(4323, 1236, "JCPenny", true, "05112021", 0400));
        log.add(new BuildingLog(4324, 1237, "Macy's", true, "07212020", 0630));
        log.add(new BuildingLog(4325, 1238, "TJMaxx", true, "08012020", 1600));



    }

    public List<BuildingLog> getMasterBuildingLog(){
        return new ArrayList<>(log);
    }

}
