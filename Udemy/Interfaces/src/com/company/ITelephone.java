package com.company;

/**
 * Created by arun on 4/10/16.
 */
public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
