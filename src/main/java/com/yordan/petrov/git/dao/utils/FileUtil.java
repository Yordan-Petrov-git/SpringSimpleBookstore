package com.yordan.petrov.git.dao.utils;

import java.io.IOException;

public interface FileUtil {

    String [] readFileContent(String filePath) throws IOException;
}
