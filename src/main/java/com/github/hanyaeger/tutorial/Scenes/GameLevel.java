package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.Hanny;
import com.github.hanyaeger.tutorial.entities.Swordfish;

public class GameLevel extends DynamicScene {

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        addEntity(new Swordfish(new Coordinate2D(600, 400)));
        addEntity(new Hanny(new Coordinate2D(100, 100)));
    }
}
