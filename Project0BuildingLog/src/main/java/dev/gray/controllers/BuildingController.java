package dev.gray.controllers;

import dev.gray.data.BuildingLogData;
import io.javalin.http.Context;

public class BuildingController {

    private BuildingLogData data = new BuildingLogData();

    public void handleGetAllLogs(Context ctx) {
        ctx.json(data.getMasterBuildingLog());
    }

}
