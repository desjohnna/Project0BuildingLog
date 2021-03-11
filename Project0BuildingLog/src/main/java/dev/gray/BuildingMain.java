package dev.gray;

import dev.gray.controllers.BuildingController;
import io.javalin.Javalin;

public class BuildingMain {


    public static void main(String[] args) {
//      CREATING JAVALIN APP TO RUN ON LOCALHOST:7000 AND DISPLAY WELCOME
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Welcome to the Building Log"));

//      CREATING A CONTROLLER
        BuildingController buildingController = new BuildingController();

//      GET CALL FOR MASTER BUILDING LOG
        app.get("/log", buildingController::handleGetAllLogs);


    }
}
