package com.bl.analyser;

import com.bl.model.BatsmanCSVDAO;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CricketAnalyserTest {

    private static final String IPL_MOST_RUN_CSV_FILE_PATH = "src/test/resources/IPL2019FactsheetMostRuns.csv";

    @Test
    public void givenIPLCricketLeagueData_WhenSortedOnAvg_ShouldReturnTopBattingAveragePlayer() {
            CricketAnalyser cricketAnalyser = new CricketAnalyser(CricketAnalyser.Role.BATTING);
            cricketAnalyser.loadIPLCricketerData(IPL_MOST_RUN_CSV_FILE_PATH);
            List<BatsmanCSVDAO> topBattingAverage = cricketAnalyser.getTopBattingAverage("Avg");
            Assert.assertEquals("MS Dhoni",topBattingAverage.get(0).player);
    }
}
