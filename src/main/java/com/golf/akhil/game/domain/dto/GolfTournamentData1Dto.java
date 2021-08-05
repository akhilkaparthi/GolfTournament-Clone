package com.golf.akhil.game.domain.dto;

import io.swagger.annotations.ApiModelProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * GolfTournamentData1Dto for data source type one
 */
public class GolfTournamentData1Dto {
    private static final SimpleDateFormat dateFormat
            = new SimpleDateFormat("yyyy/MM/dd");
    private Long gameId;
    @ApiModelProperty(example = "174638", name = "tournamentId", required = true)
    private Long tournamentId;

    @ApiModelProperty(example = "Women's Open Championship", name = "tournamentName", required = true)
    private String tournamentName;

    @ApiModelProperty(example = "fair", name = "forecast", required = true)
    private String forecast;

    @ApiModelProperty(example = "Sunnydale Golf Course", name = "courseName", required = true)
    private String courseName;

    @ApiModelProperty(example = "GB", name = "countryCode", required = true)
    private String countryCode;

    @ApiModelProperty(example = "09/07/21", name = "startDate", required = true)
    private String startDate;

    @ApiModelProperty(example = "13/07/21", name = "endDate", required = true)
    private String endDate;

    @ApiModelProperty(example = "4", name = "roundCount", required = true)
    private int roundCount;


    public Date getDateConverted(String timezone, String date) throws ParseException {
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        return dateFormat.parse(date);
    }

    public Long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Long tournamentId) {
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
}
