package com.golf.akhil.game.domain.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * GolfTournamentData2Dto for data source type 2
 */
public class GolfTournamentData2Dto {
    @ApiModelProperty(example = "southWestInvitational", name = "tournamentUID", required = true)
    private String tournamentUID;

    @ApiModelProperty(example = "South West Invitational", name = "competitionName", required = true)
    private String competitionName;

    @ApiModelProperty(example = "Happy Days Golf Club", name = "golfCourse", required = true)
    private String golfCourse;

    @ApiModelProperty(example = "United States of America", name = "hostCountry", required = true)
    private String hostCountry;

    @ApiModelProperty(example = "1638349200", name = "epochStart", required = true)
    private String epochStart;

    @ApiModelProperty(example = "1638468000", name = "epochFinish", required = true)
    private String epochFinish;

    @ApiModelProperty(example = "2", name = "rounds", required = true)
    private int rounds;

    @ApiModelProperty(example = "35", name = "playerCount", required = true)
    private int playerCount;

    public String getTournamentUID() {
        return tournamentUID;
    }

    public void setTournamentUID(String tournamentUID) {
        this.tournamentUID = tournamentUID;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getGolfCourse() {
        return golfCourse;
    }

    public void setGolfCourse(String golfCourse) {
        this.golfCourse = golfCourse;
    }

    public String getHostCountry() {
        return hostCountry;
    }

    public void setHostCountry(String hostCountry) {
        this.hostCountry = hostCountry;
    }

    public String getEpochStart() {
        return epochStart;
    }

    public void setEpochStart(String epochStart) {
        this.epochStart = epochStart;
    }

    public String getEpochFinish() {
        return epochFinish;
    }

    public void setEpochFinish(String epochFinish) {
        this.epochFinish = epochFinish;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
}
