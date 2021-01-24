package com.xworkz.aptitudeStarPatterns.eager;

public class StaticBlock {
	private static StaticBlock singletonInstance;
    static { 
       try {
           singletonInstance = new StaticBlock();
           } catch (Exception e) {
              throw new RuntimeException("Darn, an error occurred!", e);
           }
    }

    private StaticBlock() {
    }

    public static StaticBlock getSingletonInstance() {
        return singletonInstance;
    }

}
