package com.bl.opencsv;

public class CSVBuilderFactory {

        public static ICSVBuilder createCSVBuilder() {
            return new OpenCSVBuilder();
        }
}

