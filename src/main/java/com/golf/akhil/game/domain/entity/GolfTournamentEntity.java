package com.golf.akhil.game.domain.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

/**
 * Golf Tournament Entity
 */
@Entity
@Table(name = "golf_tournament")
public class GolfTournamentEntity {
    /**
     * Entity ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private Long gameId;

    @JsonProperty("tournamentId")
    @JsonAlias("tournamentUID")
    private String tournamentId;

    @JsonProperty("tournamentName")
    @JsonAlias("competitionName")
    private String tournamentName;

    @JsonProperty("forecast")
    private String forecast;

    @JsonProperty("courseName")
    @JsonAlias("golfCourse")
    private String courseName;

    @JsonProperty("countryCode")
    @JsonAlias("hostCountry")
    private String countryCode;

    @JsonProperty("startDate")
    @JsonAlias("epochStart")
    private Date startDate;

    @JsonProperty("endDate")
    @JsonAlias("epochFinish")
    private Date endDate;

    @JsonProperty("roundCount")
    @JsonAlias("rounds")
    private int roundCount;

    @JsonProperty("playerCount")
    private int playerCount;

    public GolfTournamentEntity() {
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
}
