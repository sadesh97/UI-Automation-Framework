package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*
 *1/4/2024 created by Sadesh Manaranju
 */
public class RetryAnalyzer implements IRetryAnalyzer {
    int count = 0;
    int reTryCount = 1;

    public boolean retry(ITestResult result) {
        while (count < reTryCount) {
            count++;
            return true;
        }
        return false;
    }

}
