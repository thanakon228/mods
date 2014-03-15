package cubeItems.renderers;

import org.lwjgl.opengl.GL11;

import cubeItems.ModelCubeWorld;
import cubeItems.RenderCubeInterface;

public class RenderCubeDust extends RenderCubeInterface{

	/**RenderFood : platform of 10x10*/
	public RenderCubeDust(ModelCubeWorld model) {
		super(model);
	}


	@Override
	public void renderEntity() {
		GL11.glRotatef(0, 0, 1, 0);
		GL11.glRotatef(0, 1, 0, 0);
		GL11.glRotatef(0, 0, 0, 1);

		GL11.glTranslatef(-0.3f,-0.3f,0.3f);

	}

	@Override
	public void renderEquipped() {
		GL11.glRotatef(-45, 0, 1, 0);
		GL11.glRotatef(0, 1, 0, 0);
		GL11.glRotatef(45, 0, 0, 1);

		GL11.glTranslatef(0.4f,-0.25f,0.2f);
	}

	@Override
	public void renderEquippedFP() {

		GL11.glRotatef(45, 0, 1, 0);
		GL11.glRotatef(0, 1, 0, 0);
		GL11.glRotatef(0, 0, 0, 1);

		GL11.glTranslatef(-0.5f,0.5f,0.8f);

	}

	@Override
	public void renderScale() {

		float f = 1.5f;
		GL11.glScalef(f,f,f);

	}
}
