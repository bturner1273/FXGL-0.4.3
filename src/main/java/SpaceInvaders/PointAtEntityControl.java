package SpaceInvaders;

import com.almasb.fxgl.entity.Control;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.RotationComponent;

import javafx.geometry.Point2D;

public final class PointAtEntityControl extends Control {
	private Entity pointAt;
	
	public PointAtEntityControl(Entity pointAt) {
		this.pointAt = pointAt;
	}

	@Override
	public void onUpdate(Entity entityToControl, double tpf) {
		entityToControl.getRotationComponent().rotateToVector(pointAt.getCenter().multiply(.25));
		entityToControl.rotateBy(tpf-52);
	}
	
	
}
