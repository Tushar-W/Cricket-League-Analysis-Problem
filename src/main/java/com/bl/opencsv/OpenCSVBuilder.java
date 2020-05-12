package com.bl.opencsv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.Reader;
import java.util.Iterator;

public class OpenCSVBuilder implements ICSVBuilder {

    @Override
    public Iterator getCSVFileIterator(Reader reader, Class csvCricketerClass) {
        return this.getCsvToBean(reader, csvCricketerClass).iterator();
    }

    private CsvToBean getCsvToBean(Reader reader, Class csvClass) {
        CsvToBeanBuilder csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
        csvToBeanBuilder.withType(csvClass);
        csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
        return csvToBeanBuilder.build();
    }
}
