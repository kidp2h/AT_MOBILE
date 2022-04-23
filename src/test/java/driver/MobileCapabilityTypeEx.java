
package driver;

import io.appium.java_client.remote.MobileCapabilityType;

public interface MobileCapabilityTypeEx extends MobileCapabilityType {
    String PLATFORM_NAME = "platformName";
    String APP_PACKAGE = "appPackage";
    String APP_ACTIVITY = "appActivity";
}