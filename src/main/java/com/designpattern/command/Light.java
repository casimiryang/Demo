package com.designpattern.command;

/**
 * Created by casimiryang on 2016/4/8.
 */
public class Light implements IControll {

    @Override
    public void execute() {
        System.out.println("open or close the light");
    }

}
