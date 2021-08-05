package com.golf.akhil.game.controller;

import com.golf.akhil.game.domain.dto.GolfTournamentData1Dto;
import com.golf.akhil.game.domain.dto.GolfTournamentData2Dto;
import com.golf.akhil.game.service.GolfTournamentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Rest API for the Golf Tournament
 */
@RestController
@RequestMapping("/golf-tournament")
@Api("Handles Management of Golf Tournament")
public class GolfTournamentController {

    @Autowired
    private GolfTournamentService golfTournamentService;

    private final Logger LOG = LoggerFactory.getLogger(GolfTournamentController.class);

    /**
     * Rest API to save golf tournament Details for data source 1
     *
     * @param golfTournamentData1Dto
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/createDataSource1", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("Creates a Golf Tournament")
    public ResponseEntity<GolfTournamentData1Dto> createGolfTournamentDataSource1(@RequestBody final GolfTournamentData1Dto golfTournamentData1Dto) throws Exception {
        LOG.info("Create request received for golf tournament for data source 1: {}", golfTournamentData1Dto);
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(golfTournamentService.createGolfTournamentDataSource1(golfTournamentData1Dto));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(golfTournamentData1Dto);
        }

    }

    /**
     * Rest API to save golf tournament Details for data source 2
     *
     * @param golfTournamentData2Dto
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/createDataSource2", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("Creates a Golf Tournament")
    public ResponseEntity<GolfTournamentData2Dto> createGolfTournamentDataSource2(@RequestBody final GolfTournamentData2Dto golfTournamentData2Dto) throws Exception {
        LOG.info("Create request received for golf tournament for data source 2: {}", golfTournamentData2Dto);
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(golfTournamentService.createGolfTournamentDataSource2(golfTournamentData2Dto));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(golfTournamentData2Dto);
        }
    }

}
