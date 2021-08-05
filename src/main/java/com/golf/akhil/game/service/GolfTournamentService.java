package com.golf.akhil.game.service;

import com.golf.akhil.game.controller.GolfTournamentController;
import com.golf.akhil.game.domain.dto.GolfTournamentData1Dto;
import com.golf.akhil.game.domain.dto.GolfTournamentData2Dto;
import com.golf.akhil.game.domain.entity.GolfTournamentEntity;
import com.golf.akhil.game.repository.GolfTournamentRepository;
import com.golf.akhil.game.util.Utilities;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

/**
 * The golf tournament Service
 */
@Service
public class GolfTournamentService {

    @Autowired
    private GolfTournamentRepository golfTournamentRepository;

    private final Logger LOG = LoggerFactory.getLogger(GolfTournamentController.class);

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Saves golf tournament to the database
     *
     * @param golfTournamentData1Dto golf tournament data source type 1
     * @return
     * @throws Exception
     */
    public GolfTournamentData1Dto createGolfTournamentDataSource1(final GolfTournamentData1Dto golfTournamentData1Dto) throws Exception {
        LOG.info(("Received create golf tournament request for data source 1"));
        try {
            golfTournamentRepository.save(convertGolfTournamentDto1ToEntity(golfTournamentData1Dto));
        } catch (ExecutionException | InterruptedException e) {
            return new GolfTournamentData1Dto();
        }
        return golfTournamentData1Dto;
    }

    /**
     * Saves golf tournament data to the database
     *
     * @param golfTournamentData2Dto golf tournament data source type 2
     * @return
     * @throws Exception
     */
    public GolfTournamentData2Dto createGolfTournamentDataSource2(final GolfTournamentData2Dto golfTournamentData2Dto) throws Exception {
        LOG.info(("Received create golf tournament request for data source 2"));
        try {
            golfTournamentRepository.save(convertGolfTournamentDto2ToEntity(golfTournamentData2Dto));
        } catch (ExecutionException | InterruptedException e) {
            return new GolfTournamentData2Dto();
        }
        return golfTournamentData2Dto;
    }

    /**
     * This method is used to convert Golf Tournament DTO Type 1 to Entity
     *
     * @param golfTournamentData1Dto Golf Tournmanent DTO Type 1
     * @return
     * @throws Exception
     */
    private GolfTournamentEntity convertGolfTournamentDto1ToEntity(GolfTournamentData1Dto golfTournamentData1Dto) throws Exception {
        GolfTournamentEntity golfTournamentEntity = null;
        if (golfTournamentData1Dto != null) {
            golfTournamentEntity = new GolfTournamentEntity();
            if (golfTournamentData1Dto.getTournamentId() > 0) {
                golfTournamentEntity.setTournamentId(golfTournamentData1Dto.getTournamentId().toString());
            }
            if (!golfTournamentData1Dto.getTournamentName().isEmpty() && !golfTournamentData1Dto.getTournamentName().isBlank()) {
                golfTournamentEntity.setTournamentName(golfTournamentData1Dto.getTournamentName());
            }
            if (!golfTournamentData1Dto.getCourseName().isEmpty() && !golfTournamentData1Dto.getCourseName().isBlank()) {
                golfTournamentEntity.setCourseName(golfTournamentData1Dto.getCourseName());
            }
            if (!golfTournamentData1Dto.getForecast().isEmpty() && !golfTournamentData1Dto.getForecast().isBlank()) {
                golfTournamentEntity.setForecast(golfTournamentData1Dto.getForecast());
            }
            if (!golfTournamentData1Dto.getCountryCode().isEmpty() && !golfTournamentData1Dto.getCountryCode().isBlank()) {
                golfTournamentEntity.setCountryCode(golfTournamentData1Dto.getCountryCode());
            }
            if (!golfTournamentData1Dto.getStartDate().isEmpty() && !golfTournamentData1Dto.getStartDate().isBlank() && Utilities.isDateValid(golfTournamentData1Dto.getStartDate())) {
                golfTournamentEntity.setStartDate(Utilities.convertSimpleDatetoSystemDate(golfTournamentData1Dto.getStartDate()));// convert simple date to system date
            }
            if (!golfTournamentData1Dto.getEndDate().isEmpty() && !golfTournamentData1Dto.getEndDate().isBlank() && Utilities.isDateValid(golfTournamentData1Dto.getEndDate())) {
                golfTournamentEntity.setEndDate(Utilities.convertSimpleDatetoSystemDate(golfTournamentData1Dto.getEndDate()));// convert simple date to system date
            }
            golfTournamentEntity.setRoundCount(golfTournamentData1Dto.getRoundCount());
        }
        return golfTournamentEntity;
    }

    /**
     * This method is used to convert Golf Tournament DTO Type 2 to Entity
     *
     * @param golfTournamentData2Dto Golf Tournament DTO Type 2
     * @return
     * @throws Exception
     */
    private GolfTournamentEntity convertGolfTournamentDto2ToEntity(GolfTournamentData2Dto golfTournamentData2Dto) throws Exception {
        GolfTournamentEntity golfTournamentEntity = null;
        if (golfTournamentData2Dto != null) {
            golfTournamentEntity = new GolfTournamentEntity();
            if (!golfTournamentData2Dto.getTournamentUID().isEmpty() && !golfTournamentData2Dto.getTournamentUID().isBlank()) {
                golfTournamentEntity.setTournamentId(golfTournamentData2Dto.getTournamentUID());
            }
            if (!golfTournamentData2Dto.getCompetitionName().isEmpty() && !golfTournamentData2Dto.getCompetitionName().isBlank()) {
                golfTournamentEntity.setTournamentName(golfTournamentData2Dto.getCompetitionName());
            }
            if (!golfTournamentData2Dto.getGolfCourse().isEmpty() && !golfTournamentData2Dto.getGolfCourse().isBlank()) {
                golfTournamentEntity.setCourseName(golfTournamentData2Dto.getGolfCourse());
            }
            if (!golfTournamentData2Dto.getHostCountry().isEmpty() && !golfTournamentData2Dto.getHostCountry().isBlank()) {
                golfTournamentEntity.setCountryCode(golfTournamentData2Dto.getHostCountry());
            }
            if (!golfTournamentData2Dto.getEpochStart().isEmpty() && !golfTournamentData2Dto.getEpochStart().isBlank()) {
                golfTournamentEntity.setStartDate(Utilities.convertEpochToDate(golfTournamentData2Dto.getEpochStart()));// convert epoch time to date
            }
            if (!golfTournamentData2Dto.getEpochFinish().isEmpty() && !golfTournamentData2Dto.getEpochFinish().isBlank()) {
                golfTournamentEntity.setEndDate(Utilities.convertEpochToDate(golfTournamentData2Dto.getEpochFinish()));// convert epoch time to date
            }
            golfTournamentEntity.setRoundCount(golfTournamentData2Dto.getRounds());
            golfTournamentEntity.setPlayerCount(golfTournamentData2Dto.getPlayerCount());
        }
        return golfTournamentEntity;
    }

}
