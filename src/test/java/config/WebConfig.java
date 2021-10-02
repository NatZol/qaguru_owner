package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${remote}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("isRemote")
    Boolean isRemote();
}
