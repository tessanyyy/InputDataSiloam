package com.juaracoding.cucumber.utils;

public enum TestScenarios {

    T1("User login valid"),
    T2("TCC.SILOAM.063 Browser menampilkan halaman home siloam"),
    T3("Input form data");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
