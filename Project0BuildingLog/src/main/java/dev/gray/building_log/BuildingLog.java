package dev.gray.building_log;

import java.io.Serializable;
import java.util.Objects;

public class BuildingLog implements Serializable {


    private Integer logEntryId;
//private Employees employees;
    private Integer userId;
    private String companyName;
    private Boolean entryLog;
    private String logDate;
    private Integer logTime;

    public BuildingLog(){
        super();
    }

    public BuildingLog(Integer logEntryId, Integer userId, String companyName, Boolean entryLog, String logDate, Integer logTime) {
        this.logEntryId = logEntryId;
        this.userId = userId;
        this.companyName = companyName;
        this.entryLog = entryLog;
        this.logDate = logDate;
        this.logTime = logTime;
    }

    public Integer getLogEntryId() {
        return logEntryId;
    }

    public void setLogEntryId(Integer logEntryId) {
        this.logEntryId = logEntryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Boolean getEntryLog() {
        return entryLog;
    }

    public void setEntryLog(Boolean entryLog) {
        this.entryLog = entryLog;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public Integer getLogTime() {
        return logTime;
    }

    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingLog that = (BuildingLog) o;
        return Objects.equals(logEntryId, that.logEntryId) && Objects.equals(userId, that.userId) && Objects.equals(companyName, that.companyName) && Objects.equals(entryLog, that.entryLog) && Objects.equals(logDate, that.logDate) && Objects.equals(logTime, that.logTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logEntryId, userId, companyName, entryLog, logDate, logTime);
    }

    @Override
    public String toString() {
        return "BuildingLog{" +
                "logEntryId=" + logEntryId +
                ", userId=" + userId +
                ", companyName='" + companyName + '\'' +
                ", entryLog=" + entryLog +
                ", logDate='" + logDate + '\'' +
                ", logTime=" + logTime +
                '}';
    }
}
