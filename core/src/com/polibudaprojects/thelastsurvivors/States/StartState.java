package com.polibudaprojects.thelastsurvivors.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.polibudaprojects.thelastsurvivors.Assets;
import com.polibudaprojects.thelastsurvivors.hud.Button;

public class StartState extends State {
    private final Texture background = Assets.get("intro.png", Texture.class);

    public StartState(StatesManager gsm) {
        super(gsm);
        Button startButton = new Button("START", () -> gsm.setState(gsm.getSelect()));
        startButton.setPosition(cam.position.x - startButton.getWidth() / 2f, cam.position.y - startButton.getHeight() / 2f);

        stage.addActor(startButton);
    }

    @Override
    public void handleInput() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(background, 0, 0);
        sb.end();
    }
}