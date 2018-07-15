package com.seprid.dictionary;

public enum FirstCase {
    Aleksandr_Abdulov("https://en.wikipedia.org/wiki/Aleksandr_Abdulov"),
    Oleg_Yankovsky("https://en.wikipedia.org/wiki/Oleg_Yankovsky"),
    Yevgeny_Leonov("https://en.wikipedia.org/wiki/Yevgeny_Leonov"),
    Vyacheslav_Tikhonov("https://en.wikipedia.org/wiki/Vyacheslav_Tikhonov"),
    Alexandra_Zakharova("https://en.wikipedia.org/wiki/Alexandra_Zakharova"),
    Viktor_Rakov("https://en.wikipedia.org/wiki/Viktor_Rakov");

    FirstCase(String link) {
        actorLink = link;
    }

    public String getActorLink() {
        return actorLink;
    }

    private String actorLink;
}
