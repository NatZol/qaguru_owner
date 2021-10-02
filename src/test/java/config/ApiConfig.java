package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:~/tmp/api.properties",
        "classpath:api.properties",
        "system:properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("token")
    String token();
}
