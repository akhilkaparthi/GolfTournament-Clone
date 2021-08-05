package com.golf.akhil.game.service;

import com.golf.akhil.game.domain.dto.GolfTournamentData1Dto;
import com.golf.akhil.game.domain.dto.GolfTournamentData2Dto;
import com.golf.akhil.game.domain.entity.GolfTournamentEntity;
import com.golf.akhil.game.repository.GolfTournamentRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {GolfTournamentService.class})
@ExtendWith(SpringExtension.class)
public class GolfTournamentServiceTest {
    @MockBean
    private GolfTournamentRepository golfTournamentRepository;

    @Autowired
    private GolfTournamentService golfTournamentService;

    private final GolfTournamentEntity golfTournamentEntityToReturn = new GolfTournamentEntity();

    @Test
    public void convertGolfTournamentDto1ToEntityTest() throws Exception {
        final GolfTournamentData1Dto golfTournamentData1DtoActual = new GolfTournamentData1Dto();
        golfTournamentData1DtoActual.setTournamentId(174638L);
        golfTournamentData1DtoActual.setTournamentName("Women's Open Championship");
        golfTournamentData1DtoActual.setCourseName("Sunnydale Golf Course");
        golfTournamentData1DtoActual.setForecast("fair");
        golfTournamentData1DtoActual.setCountryCode("GB");
        golfTournamentData1DtoActual.setStartDate("09/07/21");
        golfTournamentData1DtoActual.setEndDate("13/07/21");
        golfTournamentData1DtoActual.setRoundCount(4);

        final GolfTournamentData1Dto golfTournamentData1DtoExpected = golfTournamentService.createGolfTournamentDataSource1(golfTournamentData1DtoActual);

        Assert.assertEquals(golfTournamentData1DtoActual.getTournamentId(), golfTournamentData1DtoExpected.getTournamentId());
        Assert.assertEquals(golfTournamentData1DtoActual.getTournamentName(), golfTournamentData1DtoExpected.getTournamentName());
        Assert.assertEquals(golfTournamentData1DtoActual.getCourseName(), golfTournamentData1DtoExpected.getCourseName());
        Assert.assertEquals(golfTournamentData1DtoActual.getForecast(), golfTournamentData1DtoExpected.getForecast());
        Assert.assertEquals(golfTournamentData1DtoActual.getCountryCode(), golfTournamentData1DtoExpected.getCountryCode());
        Assert.assertEquals(golfTournamentData1DtoActual.getStartDate(), golfTournamentData1DtoExpected.getStartDate());
        Assert.assertEquals(golfTournamentData1DtoActual.getEndDate(), golfTournamentData1DtoExpected.getEndDate());
        Assert.assertEquals(golfTournamentData1DtoActual.getRoundCount(), golfTournamentData1DtoExpected.getRoundCount());
    }

    @Test
    public void convertGolfTournamentDto2ToEntityTest() throws Exception {
        final GolfTournamentData2Dto golfTournamentData2DtoActual = new GolfTournamentData2Dto();
        golfTournamentData2DtoActual.setTournamentUID("southWestInvitational");
        golfTournamentData2DtoActual.setCompetitionName("South West Invitational");
        golfTournamentData2DtoActual.setGolfCourse("Happy Days Golf Club");
        golfTournamentData2DtoActual.setHostCountry("United States of America");
        golfTournamentData2DtoActual.setEpochStart("1638349200");
        golfTournamentData2DtoActual.setEpochFinish("1638468000");
        golfTournamentData2DtoActual.setRounds(2);
        golfTournamentData2DtoActual.setPlayerCount(35);

        final GolfTournamentData2Dto golfTournamentData2DtoExpected = golfTournamentService.createGolfTournamentDataSource2(golfTournamentData2DtoActual);

        Assert.assertEquals(golfTournamentData2DtoActual.getTournamentUID(), golfTournamentData2DtoExpected.getTournamentUID());
        Assert.assertEquals(golfTournamentData2DtoActual.getCompetitionName(), golfTournamentData2DtoExpected.getCompetitionName());
        Assert.assertEquals(golfTournamentData2DtoActual.getGolfCourse(), golfTournamentData2DtoExpected.getGolfCourse());
        Assert.assertEquals(golfTournamentData2DtoActual.getHostCountry(), golfTournamentData2DtoExpected.getHostCountry());
        Assert.assertEquals(golfTournamentData2DtoActual.getEpochStart(), golfTournamentData2DtoExpected.getEpochStart());
        Assert.assertEquals(golfTournamentData2DtoActual.getEpochFinish(), golfTournamentData2DtoExpected.getEpochFinish());
        Assert.assertEquals(golfTournamentData2DtoActual.getRounds(), golfTournamentData2DtoExpected.getRounds());
        Assert.assertEquals(golfTournamentData2DtoActual.getPlayerCount(), golfTournamentData2DtoExpected.getPlayerCount());
    }
}

