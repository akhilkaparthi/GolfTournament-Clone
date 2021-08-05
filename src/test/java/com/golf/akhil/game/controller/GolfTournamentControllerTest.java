package com.golf.akhil.game.controller;

import com.golf.akhil.game.domain.dto.GolfTournamentData1Dto;
import com.golf.akhil.game.domain.dto.GolfTournamentData2Dto;
import com.golf.akhil.game.service.GolfTournamentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GolfTournamentController.class)
public class GolfTournamentControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private GolfTournamentService golfTournamentService;

    @Test
    public void createGolfTournamentDataSource1Test() throws Exception {
        final String jsonGoulfTournamentData1 = new String((Files.readAllBytes(Paths.get("src/test/resources/fixtures/newGolfTournamentData1.json"))));
        final GolfTournamentData1Dto golfTournamentData1Dto = new GolfTournamentData1Dto();
        golfTournamentData1Dto.setTournamentId(174638L);
        golfTournamentData1Dto.setTournamentName("Women's Open Championship");
        golfTournamentData1Dto.setCourseName("Sunnydale Golf Course");
        golfTournamentData1Dto.setForecast("fair");
        golfTournamentData1Dto.setCountryCode("GB");
        golfTournamentData1Dto.setStartDate("09/07/21");
        golfTournamentData1Dto.setEndDate("13/07/21");
        golfTournamentData1Dto.setRoundCount(4);
        given(this.golfTournamentService.createGolfTournamentDataSource1(any(GolfTournamentData1Dto.class))).willReturn(golfTournamentData1Dto);
        this.mvc.perform(post("/golf-tournament/createDataSource1").contentType(MediaType.APPLICATION_JSON).content(jsonGoulfTournamentData1)).andExpect(status().isCreated());


    }
    @Test
    public void createGolfTournamentDataSourceTestingForWrongEndPoint() throws Exception {
        final String jsonGoulfTournamentData1 = new String((Files.readAllBytes(Paths.get("src/test/resources/fixtures/newGolfTournamentData1.json"))));
        final GolfTournamentData1Dto golfTournamentData1Dto = new GolfTournamentData1Dto();
        golfTournamentData1Dto.setTournamentId(174638L);
        golfTournamentData1Dto.setTournamentName("Women's Open Championship");

        given(this.golfTournamentService.createGolfTournamentDataSource1(any(GolfTournamentData1Dto.class))).willReturn(golfTournamentData1Dto);
        this.mvc.perform(post("/golf-tournament/createDataSource").contentType(MediaType.APPLICATION_JSON).content(jsonGoulfTournamentData1)).andExpect(status().is4xxClientError());

    }

    @Test
    public void createGolfTournamentDataSource2Test() throws Exception {
        final String jsonGoulfTournamentData2 = new String((Files.readAllBytes(Paths.get("src/test/resources/fixtures/newGolfTournamentData2.json"))));
        final GolfTournamentData2Dto golfTournamentData2Dto = new GolfTournamentData2Dto();
        golfTournamentData2Dto.setTournamentUID("southWestInvitational");
        golfTournamentData2Dto.setCompetitionName("South West Invitational");
        golfTournamentData2Dto.setGolfCourse("Happy Days Golf Club");
        golfTournamentData2Dto.setHostCountry("United States of America");
        golfTournamentData2Dto.setEpochStart("1638349200");
        golfTournamentData2Dto.setEpochFinish("1638468000");
        golfTournamentData2Dto.setRounds(2);
        golfTournamentData2Dto.setPlayerCount(35);
        given(this.golfTournamentService.createGolfTournamentDataSource2(any(GolfTournamentData2Dto.class))).willReturn(golfTournamentData2Dto);
        this.mvc.perform(post("/golf-tournament/createDataSource2").contentType(MediaType.APPLICATION_JSON).content(jsonGoulfTournamentData2)).andExpect(content().json(jsonGoulfTournamentData2, true));

    }

}

