package com.niklasarndt.actionstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Niklas on 2020/07/25
 */
public class Bootstrap {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public Bootstrap() {
    }

    public static void main(String[] args) {
        new Bootstrap().getOutput();
    }

    public void getOutput() {
        if (isObvious()) {
            logger.info("Everything works as expected.");
        } else {
            logger.error("What the hell happened here?");
        }
    }

    public boolean isObvious() {
        return true;
    }
}
