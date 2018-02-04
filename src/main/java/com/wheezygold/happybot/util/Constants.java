package com.wheezygold.happybot.util;

public enum Constants {

    GUILD_ID("237363812842340363"),
    OWNER_ID("194473148161327104"),
    BOT_ID("354736186516045835"),
    HAPPYHEART_TWITTER_ID("865017489213673472"),
    SQL_USERNAME("root"),
    SQL_DATABASE_NAME("coins"),
    HAPPYHEART_DISCORD_ID("206547133338222592"),
    TEDDY_ID("242849297685544962"),
    HAPPYHEART_CHANNEL_ID("UC-enFKOrEf6N2Kq_YG3sFcQ");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }

}
