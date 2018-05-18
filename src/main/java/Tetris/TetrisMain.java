package Tetris;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.entity.view.EntityView;
import com.almasb.fxgl.settings.GameSettings;

public class TetrisMain extends GameApplication{

	@Override
	protected void initSettings(GameSettings settings) {
		settings.setIntroEnabled(true);
		settings.setManualResizeEnabled(true);
		settings.setWidth(295);
		settings.setHeight(480);
		settings.setTitle("Tetris");
		settings.setVersion("");
	}
	
	@Override
	protected void initUI() {
		getGameScene().addGameView(new EntityView(getAssetLoader().loadTexture("Tetris/background.jpg")));
	}

	public static void main(String[] args) {
		launch(args);
	}
}
