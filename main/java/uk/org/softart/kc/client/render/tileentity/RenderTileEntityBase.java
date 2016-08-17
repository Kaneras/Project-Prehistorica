package uk.org.softart.kc.client.render.tileentity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderTileEntityBase extends TileEntitySpecialRenderer {

	private ModelBase model;
	private ResourceLocation texture;

	private IRenderExtender renderExtender;

	public RenderTileEntityBase() {
	}

	public RenderTileEntityBase(ModelBase model, ResourceLocation texture) {
		this.model = model;
		this.texture = texture;
	}

	public void setRenderExtender(IRenderExtender renderExtender) {
		this.renderExtender = renderExtender;
	}

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage) {
		int metadata = te.getBlockMetadata();
		int rotationAngle = 0;
		switch (metadata % 4) {
		case 0:
			rotationAngle = 90;
			break;
		case 1:
			rotationAngle = 270;
			break;
		case 2:
			rotationAngle = 180;
			break;
		case 3:
			rotationAngle = 0;
			break;
		}

		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5F, y + 1.5F, z + 0.5F);

		GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
		GlStateManager.rotate(rotationAngle, 0.0F, 1.0F, 0.0F);

		GlStateManager.pushMatrix();

		if (renderExtender != null)
			renderExtender.preRender(te);

		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		if (renderExtender != null)
			renderExtender.postRender(te);

		GlStateManager.popMatrix();
		GlStateManager.popMatrix();
	}

}
