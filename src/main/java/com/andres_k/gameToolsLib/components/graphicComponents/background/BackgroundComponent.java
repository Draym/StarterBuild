package com.andres_k.gameToolsLib.components.graphicComponents.background;

import com.andres_k.gameToolsLib.components.gameComponent.animations.AnimatorController;
import com.andres_k.gameToolsLib.components.graphicComponents.effects.effect.Effect;
import com.andres_k.gameToolsLib.components.graphicComponents.effects.effect.EffectType;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * Created by andres_k on 08/02/2016.
 */
public abstract class BackgroundComponent {
    protected AnimatorController animator;
    protected float x;
    protected float y;

    protected boolean ready;
    protected boolean running;
    protected boolean activated;

    public BackgroundComponent(AnimatorController animator) throws SlickException {
        this(animator, 0, 0);
    }

    public BackgroundComponent(AnimatorController animator, float x, float y) throws SlickException {
        this.ready = false;
        this.running = false;
        this.activated = true;
        this.x = x;
        this.y = y;
        this.animator = animator;
        this.animator.setUseCameraMove(false);
    }

    // FUNCTIONS
    public void run() {
        this.running = true;
    }

    public void stop() {
        this.running = false;
    }

    public void activate(boolean value) {
        this.activated = value;
    }

    public void draw(Graphics g) {
        if (this.animator != null && this.activated) {
            try {
                this.animator.draw(g, this.x, this.y);
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
    }

    public void update() {
        if (this.running && this.activated) {
            this.animator.update();
        }
    }

    public void playEffect(Effect effect, int priority) {
        this.animator.playEffect(effect, priority);
    }

    // GETTERS
    public boolean isActivated() {
        return this.activated;
    }

    public boolean isReady() {
        return this.ready;
    }

    public boolean isRunning() {
        return this.running;
    }

    public boolean hasActivity() {
        return this.animator.hasEffectActivity();
    }

    public boolean effectIsRunning(String id) {
        return this.animator.effectIsRunning(id);
    }

    public boolean effectIsActive(EffectType type) {
        return this.animator.effectIsActive(type);
    }
}
