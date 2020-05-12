package com.bl.opencsv;

import java.io.Reader;
import java.util.Iterator;

public interface ICSVBuilder {
    Iterator getCSVFileIterator(Reader reader, Class csvCricketerClass);
}
