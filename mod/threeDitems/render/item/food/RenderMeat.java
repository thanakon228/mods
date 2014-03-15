package threeDitems.render.item.food;

import net.minecraft.client.model.ModelBase;

import org.lwjgl.opengl.GL11;

import threeDitems.render.Render3DInterface;

public class RenderMeat extends Render3DInterface{

	public RenderMeat(ModelBase model, String texture) {
		super(model, texture);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderEntity() {
		GL11.glRotatef(0,0,1,0);
		GL11.glRotatef(0,0,0,1);
		GL11.glRotatef(0,1,0,0);

		GL11.glTranslatef(0f, 0f, 0f);
	}

	@Override
	public void renderEquipped() {
		GL11.glRotatef(110,0,1,0);
		GL11.glRotatef(10,0,0,1);
		GL11.glRotatef(75,1,0,0);

		GL11.glTranslatef(-0.3f, 0.35f, 0f);

		float f = 0.5f;
		GL11.glScalef(f, f, f);
	}

	@Override
	public void renderEquippedFP() {
		GL11.glRotatef(45,0,1,0);
		GL11.glRotatef(0,0,0,1);
		GL11.glRotatef(90,1,0,0);

		GL11.glTranslatef(0f, 0.7f, -0.5f);
	}

	@Override
	public void renderScale() {
		float f = 3f;
		GL11.glScalef(f, f, f);
	}

}
