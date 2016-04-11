package com.company;

import java.util.List;

/**
 * Created by arun on 4/10/16.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}

