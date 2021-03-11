package dev.gray.controllers;

import dev.gray.building_log.BuildingLog;
import dev.gray.data.BuildingLogData;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;
import java.util.List;


public class BuildingController {

    private final BuildingLogData data = new BuildingLogData();

    public void handleGetAllLogs(@NotNull Context ctx) {
        ctx.json(data.getMasterBuildingLog());
    }

    public void handleFindLogByUserId(Context ctx) {

//      CREATING A VARIABLE TO HOLD THE PATH PARAMETER ID IN
        String idString = ctx.pathParam("id");

//      PARSING ID FROM A STRING TO AN INT
        int idInput = Integer.parseInt(idString);

//      CREATING A LIST TO PUT THE LOGS MATCHING THE USER ID IN
        List<BuildingLog> userLog = data.findLogByUserId(idInput);

//      DISPLAYING THE LIST OF LOGS IN JSON FORMAT
        ctx.json(userLog);
    }

}
