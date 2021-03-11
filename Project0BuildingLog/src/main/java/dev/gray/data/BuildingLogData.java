package dev.gray.data;

import dev.gray.building_log.BuildingLog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BuildingLogData {

    private List<BuildingLog> log = new ArrayList<>();


    public BuildingLogData() {
        super();

        log.add(new BuildingLog(4321, 1234, "Hersey's", true, "02022021", 0600));
        log.add(new BuildingLog(4322, 1234, "Ross", true, "03012021", 0700));
        log.add(new BuildingLog(4323, 1236, "JCPenny", true, "05112021", 0400));
        log.add(new BuildingLog(4324, 1237, "Macy's", true, "07212020", 0630));
        log.add(new BuildingLog(4325, 1238, "TJMaxx", true, "08012020", 1600));


    }

    public List<BuildingLog> getMasterBuildingLog() {
        return new ArrayList<>(log);
    }

    public List<BuildingLog> findLogByUserId(int id) {


//     RETURNING A STREAM THAT FILTERS AND ADDS TO A LIST
        return (log.stream()
//     FILTERING THE BUILDING LOG OBJECTS FOR ID THAT MATCH THE PASSED IN ID
                .filter(log1 -> log1.getUserId() == id)
//     COLLECTING THE LOGS THAT MATCH TO THE LIST CREATED
                .collect(Collectors.toList()));


    }

}
