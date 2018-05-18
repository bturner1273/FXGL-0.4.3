package NinjaIO;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.entity.view.EntityView;
import com.almasb.fxgl.settings.GameSettings;

public class NinjaIOMain extends GameApplication{

	@Override
	protected void initSettings(GameSettings settings) {
		settings.setManualResizeEnabled(true);
		settings.setTitle("NinjaIO");
		settings.setVersion("");
		settings.setIntroEnabled(true);
		settings.setProfilingEnabled(false);
		settings.setWidth(2048);
		settings.setHeight(1546);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override 
	protected void initGame() {
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_11_background.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_10_distant_clouds.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_09_distant_clouds1.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_08_clouds.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_07_huge_clouds.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_06_hill2.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_05_hill1.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_04_bushes.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_03_distant_trees.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_02_trees and bushes.png")));
		getGameScene().addUINode(new EntityView(getAssetLoader().loadTexture("backgroundPics/_01_ground.png")));
	}

}
